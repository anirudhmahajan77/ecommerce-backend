package com.ecommerce.assignment.Model.Response;

import com.ecommerce.assignment.Model.Product;

import java.util.List;

public class AllProductReponse {
    List<Product> product;

    public AllProductReponse() {
    }

    public AllProductReponse(List<Product> product) {
        this.product = product;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }
}
