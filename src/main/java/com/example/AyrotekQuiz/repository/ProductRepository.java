package com.example.AyrotekQuiz.repository;

import com.example.AyrotekQuiz.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String> {
}
