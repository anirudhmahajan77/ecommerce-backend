package com.ecommerce.assignment.Service;

import com.ecommerce.assignment.Model.Category;
import com.ecommerce.assignment.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public Category getCategoryById(Long id){
        return categoryRepository.findById(id).orElse(null);
    }

    public Category addNewCategory(Category category) {
        return categoryRepository.save(category);
    }

    public List<Category> getAll() {
        return categoryRepository.findAll();
    }
}
