package com.collicode.expensetracker.repository;

import com.collicode.expensetracker.exceptions.EtAuthException;
import com.collicode.expensetracker.domain.User;

public interface UserRepository  {
Integer create(String firstName,String lastName,String email,String password)throws EtAuthException;
User findByEmailAndPassword(String email,String password)throws EtAuthException;
Integer getCountByEmail(String email);
User findById(Integer userId);

}
