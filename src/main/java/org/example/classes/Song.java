package org.example.classes;

public class Song {

    private String title;
    private String artist;
    private String album;
    private int duration;
    private String genre;
    private String filePath;

    public Song(String title, int duration, String filePath) {
        this.title = title;
        this.duration = duration;
        this.filePath = filePath;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
       return this.album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getDuration() {
        return this.duration;
    }

    private void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
