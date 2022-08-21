package com.example.AyrotekQuiz.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserProductResponse {
    private String productName;
    private String brand;
    private Long price;
    private Integer unitsInStock;
}
