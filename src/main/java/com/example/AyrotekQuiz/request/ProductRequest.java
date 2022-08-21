package com.example.AyrotekQuiz.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@Builder
public class ProductRequest {

    @NotEmpty(message = "this field is required")
    private String productName;

    @NotEmpty(message = "this field is required")
    private String brand;

    @NotEmpty(message = "this field is required")
    private Long price;

    @NotEmpty(message = "this field is required")
    private Integer unitsInStock;

    private String userId;
}
