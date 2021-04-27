package com.ecommerce.assignment.Repository;

import com.ecommerce.assignment.Model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String> {
}
