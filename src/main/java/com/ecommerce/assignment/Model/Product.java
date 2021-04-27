package com.ecommerce.assignment.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    String uid;
    String name;
    String price;
    String shortDesc;
    String description;

    public Product() {
    }

    public Product(String uid, String name, String price, String shortDesc, String description) {
        this.uid = uid;
        this.name = name;
        this.price = price;
        this.shortDesc = shortDesc;
        this.description = description;
    }

    public String getUuid() {
        return uid;
    }
    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
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
