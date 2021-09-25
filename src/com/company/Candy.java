package com.company;

public class Candy extends Product{
    private String shape;
    private String color;

    public Candy(double price, String name, String flavour, int quantity, String shape, String color) {
        super(price, name, flavour, quantity);
        this.shape = shape;
        this.color = color;
    }

    public Candy() {
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Candy{" +
                super.toString()+
                "shape='" + shape + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
