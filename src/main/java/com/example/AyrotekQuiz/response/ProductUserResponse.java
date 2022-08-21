package com.example.AyrotekQuiz.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductUserResponse {

    private String firstName;
    private String lastName;
    private Integer age;
    private String email;

}
