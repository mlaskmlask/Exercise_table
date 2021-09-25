package com.company;

public class Product {
    private double price;
    private String name;
    private String flavour;
    private int quantity;

    public Product(double price, String name, String flavour, int quantity) {
        this.price = price;
        this.name = name;
        this.flavour = flavour;
        this.quantity = quantity;
    }

    public Product() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "price=" + price +
                ", name='" + name + '\'' +
                ", flavour='" + flavour + '\'' +
                ", quantity=" + quantity+ " ";
    }
}
