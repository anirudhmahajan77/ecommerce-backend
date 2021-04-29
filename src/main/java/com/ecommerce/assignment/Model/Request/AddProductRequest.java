package com.ecommerce.assignment.Model.Request;

public class AddProductRequest {
    String name;
    int price;
    String shortDesc;
    String description;
    Long categoryId;
    String tags;

    public AddProductRequest() {
    }

    public AddProductRequest(int price, String shortDesc, String description, Long categoryId, String tags) {
        this.price = price;
        this.shortDesc = shortDesc;
        this.description = description;
        this.categoryId = categoryId;
        this.tags = tags;
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

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}
