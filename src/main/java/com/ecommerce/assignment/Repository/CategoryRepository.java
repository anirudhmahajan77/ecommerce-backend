package com.ecommerce.assignment.Repository;

import com.ecommerce.assignment.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
