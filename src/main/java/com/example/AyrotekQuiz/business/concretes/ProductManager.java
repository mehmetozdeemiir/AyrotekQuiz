package com.example.AyrotekQuiz.business.concretes;

import com.example.AyrotekQuiz.business.abstracts.ProductService;
import com.example.AyrotekQuiz.exceptions.ProductNotFoundException;
import com.example.AyrotekQuiz.model.Product;
import com.example.AyrotekQuiz.model.User;
import com.example.AyrotekQuiz.repository.ProductRepository;
import com.example.AyrotekQuiz.request.ProductRequest;
import com.example.AyrotekQuiz.response.ProductResponse;
import com.example.AyrotekQuiz.response.converter.ProductResponseConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductManager implements ProductService {

    private final ProductRepository productRepository;
    private final UserManager userManager;
    private final ProductResponseConverter productResponseConverter;

    @Override
    public ProductResponse addProduct(ProductRequest productRequest) {
        User user = userManager.findById(productRequest.getUserId());
        Product product= productRepository.save(Product.builder()
                        .productName(productRequest.getProductName())
                        .brand(productRequest.getBrand())
                        .price(productRequest.getPrice())
                        .unitsInStock(productRequest.getUnitsInStock())
                        .user(user)
                        .build());
        return productResponseConverter.from(product);
    }

    @Override
    public ProductResponse updateProduct(String id, ProductRequest productRequest) {
        Product product= productRepository.findById(id).orElseThrow(()->new ProductNotFoundException("Product couldn't be found by following id: "+ id)); //getbyid deprecated
        product.setProductName(productRequest.getProductName());
        product.setBrand(productRequest.getBrand());
        product.setPrice(productRequest.getPrice());
        product.setUnitsInStock(productRequest.getUnitsInStock());
        Product updatedProduct=productRepository.save(product);
        return productResponseConverter.from(updatedProduct);
    }

    @Override
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<ProductResponse> getAllProducts() {
        return productRepository.findAll().stream().map(productResponseConverter::from).collect(Collectors.toList());
    }


}
