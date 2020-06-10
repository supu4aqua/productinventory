package com.thinkful.inventory;

public class Product {
    private String title;
    private String description;
    private double basePrice;

    public Product() {
        this("Not set", "None given", 0);
    }

    public Product(String title, String description, double basePrice) {
        this.setTitle(title);
        this.setDescription(description);
        this.setBasePrice(basePrice);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return product.getBasePrice() == getBasePrice() &&
                getTitle().equals(product.getTitle()) &&
                getDescription().equals(product.getDescription());
    }

    @Override
    public String toString() {
        return String.format("Product{title='%s', basePrice=$%.2f}",
                getTitle(), getBasePrice());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}
