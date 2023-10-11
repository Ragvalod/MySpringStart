package com.confucy_mazuta.myspringstart;

public class MusicPlayer {
    private Music music;

    private String name;

    private int volume;

    public MusicPlayer() {
    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

    private void Init(){
        System.out.println("Init");
    }

    private void Destroy() {
        System.out.println("Destroy");
    }
    public void PlayMusic() {
        System.out.println("Сейчас " + music.getSong());
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
