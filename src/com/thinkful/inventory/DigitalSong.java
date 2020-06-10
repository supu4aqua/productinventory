package com.thinkful.inventory;

public class DigitalSong extends DigitalMedia{
    private String artist;

    public DigitalSong() {
        this("No name", "No description", 0);
    }

    public DigitalSong(String title, String description, double basePrice) {
        this(title, description, basePrice,
                1, "https://");
    }

    public DigitalSong(String title, String description, double basePrice,
                       double fileSize, String downloadLink) {
        this(title, description, basePrice,
                fileSize, downloadLink, "None",
                2020, 1);
    }

    public DigitalSong(String title, String description, double basePrice,
                       double fileSize, String downloadLink, String genre,
                       int year, int playBackLength) {
        this(title, description, basePrice,
                fileSize, downloadLink, genre,
                year, playBackLength, "None");
    }

    public DigitalSong(String title, String description, double basePrice,
                       double fileSize, String downloadLink, String genre,
                       int year, int playBackLength, String artist) {
        super(title, description, basePrice,
                fileSize, downloadLink, genre,
                year, playBackLength);
        this.setArtist(artist);
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
