package com.example.AyrotekQuiz.response.converter;


import com.example.AyrotekQuiz.model.User;
import com.example.AyrotekQuiz.response.UserResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;


@Component
@Data
@AllArgsConstructor
public class UserResponseConverter {

    private final UserProductResponseConverter userProductResponseConverter;

    public UserResponse fromUser(User user){
        return new UserResponse(
                user.getFirstName(),
                user.getLastName(),
                user.getAge(),
                user.getEmail(),
                user.getIsActive());
    }
}
