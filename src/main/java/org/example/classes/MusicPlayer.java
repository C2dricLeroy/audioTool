package org.example.classes;



public class MusicPlayer {

    private Playlist currentPlaylist;
    private AudioControl audioControl;
    private boolean isPlaylistShuffle;


    public void play() {

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
