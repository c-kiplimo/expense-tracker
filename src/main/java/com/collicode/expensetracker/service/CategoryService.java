package com.collicode.expensetracker.service;

import com.collicode.expensetracker.domain.Category;
import com.collicode.expensetracker.exceptions.EtBadRequestException;
import com.collicode.expensetracker.exceptions.EtResourceNotFoundException;

import java.util.List;

public interface CategoryService {
    List<Category>fetchAllCategories(Integer userId);
    Category fetchCategoryById(Integer userId,Integer categoryId) throws EtResourceNotFoundException;
    Category addCategory(Integer userId,String title,String description) throws EtResourceNotFoundException;
    void updateCategory(Integer userId,Integer categoryId,Category category) throws EtBadRequestException;
    void removeCategoryWithAllTransactions(Integer userId,Integer categoryId) throws EtBadRequestException;

}
