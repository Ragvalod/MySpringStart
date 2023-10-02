package com.confucy_mazuta.myspringstart;

public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void PlayMusic() {
        System.out.println("Сейчас " + music.getSong());
    }
}
