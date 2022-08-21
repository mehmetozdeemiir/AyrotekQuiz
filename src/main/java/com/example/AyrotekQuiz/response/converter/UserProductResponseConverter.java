package com.example.AyrotekQuiz.response.converter;

import com.example.AyrotekQuiz.model.Product;
import com.example.AyrotekQuiz.response.UserProductResponse;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class UserProductResponseConverter {

    public UserProductResponse convertToProductUser(Product product){
        return new UserProductResponse(
                product.getProductName(),
                product.getBrand(),
                product.getPrice(),
                product.getUnitsInStock()
        );
    }
}
