package com.ecommerce.assignment.Repository;

import com.ecommerce.assignment.Model.Category;
import com.ecommerce.assignment.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE p.name LIKE %?1%")
    public List<Product> findByName(String value);

    //@Query("SELECT p FROM Product p WHERE p.category.id = ?1")
    public List<Product> findByCategory(Category cat);

    public List<Product> findByCategoryName(String name);
}
