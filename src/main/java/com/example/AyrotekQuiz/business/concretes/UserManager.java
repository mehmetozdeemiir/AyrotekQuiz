package com.example.AyrotekQuiz.business.concretes;

import com.example.AyrotekQuiz.business.abstracts.UserService;
import com.example.AyrotekQuiz.exceptions.UserIsNotFoundException;
import com.example.AyrotekQuiz.exceptions.UserNotFoundException;
import com.example.AyrotekQuiz.model.User;
import com.example.AyrotekQuiz.repository.UserRepository;
import com.example.AyrotekQuiz.request.UserRequest;
import com.example.AyrotekQuiz.response.UserResponse;
import com.example.AyrotekQuiz.response.converter.UserResponseConverter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserManager implements UserService {

    private final UserRepository userRepository;
    private final UserResponseConverter userResponseConverter;

    @Override
    public UserResponse addUser(UserRequest userRequest) {
        User user= userRepository.save(User.builder()
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .age(userRequest.getAge())
                .email(userRequest.getEmail())
                .isActive(true).build());
        return userResponseConverter.fromUser(user);
    }

    @Override
    public UserResponse updateUser(String id, UserRequest userRequest) {
        User user= findById(id);
        if(!user.getIsActive()){
            log.warn("The user wanted update is not active! {}",id);
            throw new UserIsNotFoundException();
        }
        user.setFirstName(userRequest.getFirstName());
        user.setLastName(userRequest.getLastName());
        user.setAge(userRequest.getAge());
        user.setEmail(userRequest.getEmail());
        User updatedUser=userRepository.save(user);
        return userResponseConverter.fromUser(updatedUser);
    }

    @Override
    public List<UserResponse> getAllUser() {
        return userRepository.findAll().stream().map(userResponseConverter::fromUser).collect(Collectors.toList());
    }

    @Override
    public UserResponse getUser(String id) {
        User user =findById(id);
        return userResponseConverter.fromUser(user);
    }

    @Override
    public void activeUser(String id) {
        changeActiveUser(id,true);
    }

    @Override
    public void deactiveUser(String id) {
        changeActiveUser(id,false);
    }

    @Override
    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }

    private void changeActiveUser(String id ,Boolean isActive){
        User user=findById(id);
        User updatedUser= new User(
          user.getId(),
          user.getFirstName(),
          user.getLastName(),
          user.getAge(),
          user.getEmail(),
          isActive);

        userRepository.save(updatedUser);
    }

    protected User findById(String id){
        return userRepository.findById(id)
                .orElseThrow(()-> new UserNotFoundException("User couldn't be found by following id: "+ id));
    }

}
