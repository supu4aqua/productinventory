package com.thinkful.inventory;

import java.util.Date;

public class DigitalBook extends DigitalProduct implements LoanItem{
    private int numberPages;
    private String author;
    private String publisher;
    private Date publishDate;
    private int loanLength;

    public DigitalBook() {
        this("No name", "No description", 0);
    }

    public DigitalBook(String title, String description, double basePrice) {
        this(title, description, basePrice,
                1, "https://");
    }

    public DigitalBook(String title, String description, double basePrice,
                       double fileSize, String downloadLink) {
        this(title, description, basePrice,
                fileSize, downloadLink, 1, "None", "None", null);
    }

    public DigitalBook(String title, String description, double basePrice,
                       double fileSize, String downloadLink, int numberPages,
                       String author, String publisher, Date publishDate) {
        super(title, description, basePrice, fileSize, downloadLink);
        this.setNumberPages(numberPages);
        this.setAuthor(author);
        this.setPublisher(publisher);
        this.setPublishDate(publishDate);
        this.setLoanLength(1);
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public int getLoanLength() {
        return loanLength;
    }

    @Override
    public void setLoanLength(int loanLength) {
        this.loanLength = loanLength;
    }
}

