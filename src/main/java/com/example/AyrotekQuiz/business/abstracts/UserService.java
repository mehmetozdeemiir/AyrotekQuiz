package com.example.AyrotekQuiz.business.abstracts;

import com.example.AyrotekQuiz.request.UserRequest;
import com.example.AyrotekQuiz.response.UserResponse;
import java.util.List;

public interface UserService {

    UserResponse addUser(UserRequest userRequest);

    UserResponse updateUser(String id,UserRequest userRequest);

    void deleteUser(String id);

    List<UserResponse> getAllUser();

    UserResponse getUser(String id);

    void activeUser(String id);

    void deactiveUser(String id);

}
