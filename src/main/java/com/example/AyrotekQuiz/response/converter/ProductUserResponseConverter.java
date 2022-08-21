package com.example.AyrotekQuiz.response.converter;

import com.example.AyrotekQuiz.model.User;
import com.example.AyrotekQuiz.response.ProductUserResponse;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ProductUserResponseConverter {

    public ProductUserResponse convertToUserProduct(User user){

        return new ProductUserResponse(user.getFirstName(),
                user.getLastName(),
                user.getAge(),
                user.getEmail());
    }
}
