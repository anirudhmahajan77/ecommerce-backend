package com.ecommerce.assignment.Model.Response;

import com.ecommerce.assignment.Model.Product;

public class SingleProductResponse {
    Product product;

    public SingleProductResponse() {
    }


    public SingleProductResponse(Product reponse) {
        this.product = reponse;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
