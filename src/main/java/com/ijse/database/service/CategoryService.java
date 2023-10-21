package com.ijse.database.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.database.entity.Category;

@Service
public interface CategoryService {
    Category createCategory(Category category);//create method
    Category getCategoryById(Long id);//read user by category_id
    List <Category> getAllCategories();//read all categories
    Category updateCategory(Long id, Category category);//update by id
    
}
