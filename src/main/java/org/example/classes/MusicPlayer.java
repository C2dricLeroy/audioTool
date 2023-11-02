package org.example.classes;


import javax.sound.sampled.*;
import javax.sound.sampled.spi.AudioFileReader;
import java.io.File;
import java.io.IOException;

import static javax.sound.sampled.AudioSystem.getAudioInputStream;

public class MusicPlayer {

    private Playlist currentPlaylist;
    private AudioControl audioControl;
    private boolean isPlaylistShuffle;
    private AudioInputStream audioInputStream;
    private Clip clip;

    private long currentPlaybackPosition = 0;


    public void play(File file) throws LineUnavailableException, IOException {
        try {
            audioInputStream = AudioSystem.getAudioInputStream(file);
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
            throw new LineUnavailableException("Unsupported audio format");
        } catch (IOException e) {
            e.printStackTrace();
            throw new LineUnavailableException("Error reading the audio file");
        }

        AudioFormat format = audioInputStream.getFormat();
        DataLine.Info info = new DataLine.Info(Clip.class, format);

        if (!AudioSystem.isLineSupported(info)) {
            throw new LineUnavailableException("Unsupported audio format");
        }

        try {
            clip = (Clip) AudioSystem.getLine(info);
            clip.open(audioInputStream);
            clip.start();
        } catch (LineUnavailableException | IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void pause() {
        if (clip != null && clip.isRunning()) {
            currentPlaybackPosition = clip.getMicrosecondPosition();
            clip.stop();
        }
    }

    public void resume() {
        if (clip != null) {
            clip.setMicrosecondPosition(currentPlaybackPosition);
            clip.start();
        }
    }

    public void stop() {
        if (clip != null) {
            clip.stop();
            currentPlaybackPosition = 0;
        }
    }

    public void next() {

    }

    public void previous() {

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


    private long getMicrosecondPosition() {
        if (clip != null) {
            return clip.getMicrosecondPosition();
        }
        return 0;
    }



}
