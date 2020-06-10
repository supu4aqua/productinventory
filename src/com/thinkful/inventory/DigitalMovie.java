package com.thinkful.inventory;

public class DigitalMovie extends DigitalMedia {
    private String director;
    private String starring;

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
}
