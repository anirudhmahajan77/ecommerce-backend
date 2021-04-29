package com.ecommerce.assignment.Controller;

import com.ecommerce.assignment.Model.Response.AllProductReponse;
import com.ecommerce.assignment.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class SearchController {

    @Autowired
    public ProductService productService;

    @RequestMapping("/search/{value}")
    public AllProductReponse searchProduct(@PathVariable String value){
        return productService.searchAll(value);
    }
}
