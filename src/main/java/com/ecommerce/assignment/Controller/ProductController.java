package com.ecommerce.assignment.Controller;

import com.ecommerce.assignment.Model.Request.AddProductRequest;
import com.ecommerce.assignment.Model.Response.AllProductReponse;
import com.ecommerce.assignment.Model.Product;
import com.ecommerce.assignment.Model.Response.SingleProductResponse;
import com.ecommerce.assignment.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/product")
    public AllProductReponse getAllProducts(){
        return productService.getAllProducts();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/product/{id}")
    public SingleProductResponse getSingleProduct(@PathVariable Long id){
        return productService.getSingleProducts(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/product")
    public Product addProduct(@RequestBody AddProductRequest product){
        return productService.addNewProduct(product);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/product/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody AddProductRequest product){
        return productService.updateProduct(id,product);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/product/{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/category/{id}")
    public AllProductReponse getbyCategory(@PathVariable Long id){
        return productService.getProductByCategoryName(id);
    }

}
