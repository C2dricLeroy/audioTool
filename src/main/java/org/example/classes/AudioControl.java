package org.example.classes;

public class AudioControl {

    private int volume;

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public void increaseVolume() {
        this.volume = this.volume + 1;
    }


    public void decreaseVolume() {
        this.volume = this.volume - 1;
    }

    public void mute() {

    }

    public void unmute() {

    }



}
