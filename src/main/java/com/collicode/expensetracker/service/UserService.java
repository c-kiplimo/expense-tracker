package com.collicode.expensetracker.service;

import com.collicode.expensetracker.exceptions.EtAuthException;
import com.collicode.expensetracker.domain.User;

public interface UserService {
    User validateUser(String email,String password) throws EtAuthException;
    User registerUser(String firstName, String lastName, String email, String password)throws EtAuthException;
}
