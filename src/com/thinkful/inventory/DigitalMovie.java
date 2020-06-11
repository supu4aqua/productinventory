package com.thinkful.inventory;

public class DigitalMovie extends DigitalMedia implements LoanItem{
    private String director;
    private String starring;
    private int loanLength;

    public DigitalMovie() {
        this("No name", "No description", 0);
    }

    public DigitalMovie(String title, String description, double basePrice) {
        this(title, description, basePrice, 1, "https://");
    }

    public DigitalMovie(String title, String description, double basePrice,
                        double fileSize, String downloadLink) {
        this(title, description, basePrice, fileSize, downloadLink,
                "None", 2020, 1);
    }

    public DigitalMovie(String title, String description, double basePrice,
                        double fileSize, String downloadLink, String genre,
                        int year, int playBackLength) {
        this(title, description, basePrice, fileSize, downloadLink,
                genre, year, playBackLength, "None", "None");
    }

    public DigitalMovie(String title, String description, double basePrice,
                        double fileSize, String downloadLink, String genre,
                        int year, int playBackLength, String director, String starring) {
        super(title, description, basePrice, fileSize, downloadLink, genre, year, playBackLength);
        this.setDirector(director);
        this.setStarring(starring);
        this.setLoanLength(1);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getStarring() {
        return starring;
    }

    public void setStarring(String starring) {
        this.starring = starring;
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
