package com.example.AyrotekQuiz.response;

import com.example.AyrotekQuiz.model.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductResponse {

    private String productName;
    private String brand;
    private Long price;
    private Integer unitsInStock;
    private ProductUserResponse productUserResponse;


}
