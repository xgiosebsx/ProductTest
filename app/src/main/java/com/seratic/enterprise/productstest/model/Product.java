package com.seratic.enterprise.productstest.model;

/**
 * Created by Administrador on 10/09/2016.
 */
public class Product {
    String image;
    String name;
    String price;
    String brand;

    public Product(String image, String price, String name, String brand) {
        this.image = image;
        this.price = price;
        this.name = name;
        this.brand = brand;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
