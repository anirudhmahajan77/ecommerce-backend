package com.ecommerce.assignment.Service;

import com.ecommerce.assignment.Model.Category;
import com.ecommerce.assignment.Model.Request.AddProductRequest;
import com.ecommerce.assignment.Model.Response.AllProductReponse;
import com.ecommerce.assignment.Model.Product;
import com.ecommerce.assignment.Model.Response.SingleProductResponse;
import com.ecommerce.assignment.Repository.CategoryRepository;
import com.ecommerce.assignment.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository repository;

    @Autowired
    CategoryRepository categoryRepository;

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

    public Product addNewProduct(AddProductRequest product){
        Product newProduct = new Product();
        newProduct.setName(product.getName());
        newProduct.setPrice(product.getPrice());
        newProduct.setShortDesc(product.getShortDesc());
        newProduct.setDescription(product.getDescription());
        newProduct.setTags(product.getTags());
        Category category = categoryRepository.findById(product.getCategoryId()).orElse(null);
        newProduct.setCategory(category);
        return repository.save(newProduct);
    }

    public Product updateProduct(Long id,AddProductRequest product){
        Product existingProduct = repository.findById(id).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setShortDesc(product.getShortDesc());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setTags(product.getTags());
        Category category = categoryRepository.findById(product.getCategoryId()).orElse(null);
        existingProduct.setCategory(category);
        return repository.save(existingProduct);
    }

    public void deleteProduct(Long id){
        repository.deleteById(id);
    }

    public AllProductReponse searchAll(String value){
        List<Product> response = repository.findByName(value);
        AllProductReponse allProduct = new AllProductReponse(response);
        return allProduct;
    }

    public AllProductReponse getProductByCategoryName(Long id){
        Category category = categoryRepository.findById(id).orElse(null);
        AllProductReponse reponse = new AllProductReponse(repository.findByCategory(category));
        return reponse;
    }
}
