package com.ecommerce.assignment.Controller;

import com.ecommerce.assignment.Model.Category;
import com.ecommerce.assignment.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping(method = RequestMethod.GET, path = "/category")
    public List<Category> getAllCategory(){
        return categoryService.getAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/category/detail/{id}")
    public Category getCategoryById(@PathVariable Long id){
        return categoryService.getCategoryById(id);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/category/add")
    public Category addCategory(@RequestBody Category category){
        return categoryService.addNewCategory(category);
    }

}
