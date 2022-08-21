package com.example.AyrotekQuiz.response.converter;

import com.example.AyrotekQuiz.model.Product;
import com.example.AyrotekQuiz.response.ProductResponse;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ProductResponseConverter {

    private final ProductUserResponseConverter productUserResponseConverter;

    public ProductResponse from(Product product){
        return new ProductResponse(
                product.getProductName(),
                product.getBrand(),
                product.getPrice(),
                product.getUnitsInStock(),
                productUserResponseConverter.convertToUserProduct(product.getUser())
                );
    }





}
