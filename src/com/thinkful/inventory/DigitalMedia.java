package com.thinkful.inventory;

public class DigitalMedia extends DigitalProduct{
    private String genre;
    private int year;
    private int playBackLength;

    public DigitalMedia() {
        this("No name", "No description", 1);
    }

    public DigitalMedia(String title, String description, double basePrice) {
        this(title, description, basePrice, 1, "https://");
    }

    public DigitalMedia(
            String title,
            String description,
            double basePrice,
            double fileSize,
            String downloadLink) {
            this(title, description,
                basePrice,
                fileSize,
                downloadLink,
                "None",
                2020,
                1);
    }

    public DigitalMedia(
            String title,
            String description,
            double basePrice,
            double fileSize,
            String downloadLink,
            String genre,
            int year, int playBackLength) {
        super(title, description, basePrice, fileSize, downloadLink);
        this.setGenre(genre);
        this.setYear(year);
        this.setPlayBackLength(playBackLength);
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPlayBackLength() {
        return playBackLength;
    }

    public void setPlayBackLength(int playBackLength) {
        this.playBackLength = playBackLength;
    }
}
