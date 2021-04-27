package com.ecommerce.assignment.Model;

import javax.persistence.*;

@Entity
@Table
public class Product {
    @Id
    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_sequence"
    )
    @Column(
            name = "uid",
            updatable = false
    )
    Long uid;

    @Column(
            name = "name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    String name;

    @Column(
            name = "price",
            nullable = false
    )
    int price;

    @Column(
            name = "short_desc",
            nullable = true,
            columnDefinition = "TEXT"
    )
    String shortDesc;

    @Column(
            name = "long_desc",
            nullable = true,
            columnDefinition = "TEXT"
    )
    String description;

    public Product() {
    }

    public Product(String name, int price, String shortDesc, String description) {
        this.name = name;
        this.price = price;
        this.shortDesc = shortDesc;
        this.description = description;
    }

    public Product(Long uid, String name, int price, String shortDesc, String description) {
        this.uid = uid;
        this.name = name;
        this.price = price;
        this.shortDesc = shortDesc;
        this.description = description;
    }

    public Long getUuid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
