package com.ecommerce.assignment.Model;

import javax.persistence.*;

@Entity
@Table
public class Category {

    @Id
    @Column(
            name = "id",
            updatable = false
    )
    Long id;

    String name;

    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
