package com.example.AyrotekQuiz.repository;

import com.example.AyrotekQuiz.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {



}
