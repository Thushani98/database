package com.ijse.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ijse.database.entity.Category;
import com.ijse.database.repository.CategoryRepository;


@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category createCategory(Category category){
        //create user in DB
        return categoryRepository.save(category);
    }

    @Override
    public Category getCategoryById(Long id){
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public List <Category> getAllCategories(){
        return categoryRepository.findAll();
    }

    public Category updateCategory(Long id , Category category){
        Category existingCategory = categoryRepository.findById(id).orElse(null);

        if(existingCategory != null){
            existingCategory.setName(category.getName());
            return categoryRepository.save(existingCategory);
        }else{
            return null;
        }
        
    }
}
