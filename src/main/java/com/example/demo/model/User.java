package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {
    private String firstname;
    private String lastname;
    private int age;
    private double phoneNumber;
    private String email;
    private String password;
}
