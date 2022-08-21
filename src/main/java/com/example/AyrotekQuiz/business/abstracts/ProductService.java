package com.example.AyrotekQuiz.business.abstracts;

import com.example.AyrotekQuiz.request.ProductRequest;
import com.example.AyrotekQuiz.response.ProductResponse;
import java.util.List;

public interface ProductService {

    ProductResponse addProduct(ProductRequest productRequest);

    ProductResponse updateProduct(String id,ProductRequest productRequest);

    void deleteProduct(String id);

    List<ProductResponse> getAllProducts();

}
