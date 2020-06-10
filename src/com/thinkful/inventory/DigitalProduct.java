package com.thinkful.inventory;

public class DigitalProduct extends Product{

    public static final double DIGITAL_DISCOUNT = 0.9;

    private double fileSize;
    private String downloadLink;

    public DigitalProduct() {
        this("No name", "No description", 0);
    }

    public DigitalProduct(String title, String description, double basePrice) {
        this(title, description, basePrice, 1.0, "https://");
    }

    public DigitalProduct(String title, String description, double basePrice, double fileSize, String downloadLink) {
        super(title, description, basePrice);
        this.setFileSize(fileSize);
        this.setDownloadLink(downloadLink);
    }

    @Override
    public double getFinalPrice() {
        return getBasePrice() * DIGITAL_DISCOUNT;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }
}
