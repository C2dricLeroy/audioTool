package org.example.classes;


import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.spi.AudioFileReader;
import java.io.File;
import java.io.IOException;

import static javax.sound.sampled.AudioSystem.getAudioInputStream;

public class MusicPlayer {

    private Playlist currentPlaylist;
    private AudioControl audioControl;
    private boolean isPlaylistShuffle;


    public void play(File file) throws UnsupportedAudioFileException, IOException {

    }

    public void pause() {

    }

    public void stop() {

    }

    public void next() {

    }

    public void previous() {

    }

    public void addToPlaylist(Song song) {

    }

    public void removeFromPlaylist(Song song) {

    }

    public void loadPlaylist(Playlist playlist) {

    }

    public void clearPlaylist() {
        this.currentPlaylist.clearPlaylist();
    }

    public void shufflePlaylist() {
        this.isPlaylistShuffle = !this.isPlaylistShuffle;
    }

    public boolean isPlaying() {
        return true;
    }

    public Song getCurrentSong() {
        return new Song("test", 12, "test");
    }






}
