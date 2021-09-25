package com.company;

public class CandyBar extends Product {
    private double weight;

    public CandyBar(double price, String name, String flavour, int quantity, double weight) {
        super(price, name, flavour, quantity);
        this.weight = weight;
    }

    public CandyBar() {
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "CandyBar{" +
                super.toString()+
                "weight=" + weight +
                '}';
    }
}
