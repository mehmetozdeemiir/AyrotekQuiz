package com.example.AyrotekQuiz.controller;

import com.example.AyrotekQuiz.business.abstracts.UserService;
import com.example.AyrotekQuiz.request.UserRequest;
import com.example.AyrotekQuiz.response.UserResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<UserResponse> getAllUser(){
        return userService.getAllUser();
    }
    @GetMapping("/{id}")
    public UserResponse getUser(@PathVariable String id){
        return userService.getUser(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse addUser(@RequestBody UserRequest userRequest){
        return userService.addUser(userRequest);
    }

    @PutMapping("/{id}")
    public UserResponse updateUser(@PathVariable String id, @RequestBody UserRequest userRequest){
        return userService.updateUser(id,userRequest);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id){
         userService.deleteUser(id);
    }

    @PatchMapping("/active/{id}")
    public void activeUser(@PathVariable String id){
        userService.activeUser(id);
    }

    @PatchMapping("/deactive/{id}")
    public void deactiveUser(@PathVariable String id){
        userService.deactiveUser(id);
    }



}
