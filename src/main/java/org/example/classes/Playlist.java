package org.example.classes;

public class Playlist {
    public String name;
    public Song[] songs;


    public void setName(String name) {
        this.name = name;
    }

    public void setSongs(Song[] songs) {
        this.songs = songs;
    }

    public Song[] getSongs() {
        return songs;
    }

    public String getName() {
        return name;
    }

    public void addSong(Song song) {
        
    }

}
