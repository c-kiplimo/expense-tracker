package com.collicode.expensetracker.domain;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class User {
    private  Integer userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

}
