package com.thinkful.inventory;

public class PhysicalProduct extends Product{
    private double weight;
    private double width;
    private double height;

    public PhysicalProduct() {
        this("No name", "No description", 0);
        System.out.println("No-arg constructor of PhysicalProduct");
    }

    public PhysicalProduct(String title, String description, double basePrice) {
        this(title, description, basePrice, 1.0, 1.0, 1.0);
        System.out.println("3-arg constructor of PhysicalProduct");
    }

    public PhysicalProduct(String title, String description, double basePrice, double weight, double width, double height) {
        super(title, description, basePrice);
        this.setWeight(weight);
        this.setWidth(width);
        this.setHeight(height);
        System.out.println("6-arg constructor of PhysicalProduct");
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
