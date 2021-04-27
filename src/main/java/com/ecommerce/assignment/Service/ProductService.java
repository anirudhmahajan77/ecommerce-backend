package com.ecommerce.assignment.Service;

import com.ecommerce.assignment.Model.Response.AllProductReponse;
import com.ecommerce.assignment.Model.Product;
import com.ecommerce.assignment.Model.Response.SingleProductResponse;
import com.ecommerce.assignment.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository repository;

    public AllProductReponse getAllProducts(){
        List<Product> response = repository.findAll();
        AllProductReponse allProduct = new AllProductReponse(response);
        return allProduct;
    }

    public SingleProductResponse getSingleProducts(Long id){
        Product response = repository.findById(id).orElse(null);
        SingleProductResponse allProduct = new SingleProductResponse(response);
        return allProduct;
    }

    public Product addNewProduct(Product product){
        return repository.save(product);
    }

    public Product updateProduct(Long id,Product product){
        Product existingProduct = repository.findById(id).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setShortDesc(product.getShortDesc());
        existingProduct.setDescription(product.getDescription());
        return repository.save(existingProduct);
    }

    public void deleteProduct(Long id){
        repository.deleteById(id);
    }

}
