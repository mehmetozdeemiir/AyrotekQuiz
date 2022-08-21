package com.example.AyrotekQuiz;

import com.example.AyrotekQuiz.model.User;
import com.example.AyrotekQuiz.request.UserRequest;
import com.example.AyrotekQuiz.response.UserResponse;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestSupport {

    public static UserRequest userRequestSupport2=UserRequest.builder()
            .firstName("Muhammed")
            .lastName("Mazgal")
            .age(24)
            .email("muhammed@gmail.com")
            .build();


    public static User entitySupport2=User.builder()
            .firstName("Muhammed")
            .lastName("Mazgal")
            .age(24)
            .email("muhammed@gmail.com")
            .build();


   /* public static User savedUserSupport=User.builder()
            .id(1L)
            .firstName("Muhammed")
            .lastName("Mazgal")
            .age(24)
            .email("muhammed@gmail.com")
            .build();


    */
    public static UserResponse userResponseSupport= UserResponse.builder()
            .firstName("Muhammed")
            .lastName("Mazgal")
            .age(24)
            .email("muhammed@gmail.com")
            .build();

/*
    public static List<User> generateListUser(){
        return IntStream.range(0,5).mapToObj(i-> new User(
                "Muhammed"+ i,
                "Mazgal"+ i,
                24 +i,
                "muhammed@gmail.com"+i)
        ).collect(Collectors.toList());
    }


 */
    /*
    public static List<UserResponse> generateUsersResponseList(List<User> userList){
        return userList.stream().map(from-> new UserResponse( from.getFirstName(),
                from.getLastName(),from.getAge(),from.getEmail())).collect(Collectors.toList());
    }
    
     */






}
