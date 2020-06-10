package com.thinkful.inventory;

public class DigitalProduct extends Product{
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
