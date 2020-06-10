package com.thinkful.inventory;

public class PhysicalProduct extends Product{
    public static final double SHIPPING_COST = 5;
    private double weight;
    private double width;
    private double height;

    public PhysicalProduct() {
        this("No name", "No description", 0);
    }

    public PhysicalProduct(String title, String description, double basePrice) {
        this(title, description, basePrice, 1.0, 1.0, 1.0);
    }

    public PhysicalProduct(String title, String description, double basePrice, double weight, double width, double height) {
        super(title, description, basePrice);
        this.setWeight(weight);
        this.setWidth(width);
        this.setHeight(height);
    }

    @Override
    public double getFinalPrice() {
        return getBasePrice() + SHIPPING_COST;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
