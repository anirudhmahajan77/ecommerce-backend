package com.ecommerce.assignment.Controller;

import com.ecommerce.assignment.Model.Product;
import com.ecommerce.assignment.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/product")
    public String getAllProducts(){
        return "All Products";
    }

    @RequestMapping(method = RequestMethod.GET,value = "/product/{id}")
    public String getSingleProduct(@PathVariable String id){
        return "Product:" + id;
    }

    @RequestMapping(method = RequestMethod.POST,value = "/product")
    public String postProduct(@RequestBody Product product){
        return "Product Publish";
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/product/{id}")
    public String updateProduct(@PathVariable String id){
        return "Product Update";
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/product/{id}")
    public String deleteProduct(@PathVariable String id){
        return "Product Deleted";
    }

}
