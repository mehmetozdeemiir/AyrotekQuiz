package com.example.AyrotekQuiz.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@Builder
public class UserRequest {

    @NotEmpty(message = "this field is required")
    private String firstName;

    @NotEmpty(message = "this field is required")
    private String lastName;

    @NotEmpty(message = "this field is required")
    private Integer age;

    @Email(message = "Please enter e-mail in the correct format")
    private String email;
}
