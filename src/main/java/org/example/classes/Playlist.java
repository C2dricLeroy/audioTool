package org.example.classes;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    public Playlist(String nom) {
        this.name = nom;
        songs = new ArrayList<>();
    }

    public String name;
    public List<Song> songs;


    public void setName(String name) {
        this.name = name;
    }

    public void setSongs(Song[] songs) {

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
