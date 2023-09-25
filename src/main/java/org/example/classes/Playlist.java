package org.example.classes;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    public Playlist(String name) {
        this.name = name;
        songs = new ArrayList<>();
    }

    private String name;
    private List<Song> songs;


    public void setName(String name) {
        this.name = name;
    }

    public void removeSong(Song song) {
        this.songs.remove(song);
    }

    public List<Song> getSongs() {
        return songs;
    }

    public String getName() {
        return name;
    }

    public void addSong(Song song) {
        this.songs.add(song);
    }


    public void clearPlaylist() {
        this.songs.clear();
    }

    public int getNumberOfSongs() {
        return this.songs.size();
    }

    public Song getNextSong() {
        return null;
    }

    public void getPreviousSong() {

    }

    public boolean isEmpty() {
        return this.songs.isEmpty();
    }}
