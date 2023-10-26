package com.confucy_mazuta.myspringstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    /** Урок 11 **/

    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String PlayMusic() {
        return "Проигриватель запустил::: " + music1.getSong() + ", :::" + music2.getSong();
    }

    /** Урок 10 **/
////    @Autowired
////    private Music music;
////
////    private ClassicalMusic classicalMusic;
////    private RockMusic rockMusic;
//
//    @Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
//        this.classicalMusic = classicalMusic;
//        this.rockMusic = rockMusic;
//    }
//
//    private String name;
//
//    private int volume;
//
//    public MusicPlayer() {
//    }
//
//    //Конструктор
////    @Autowired
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//    private void Init(){
//        System.out.println("Init");
//    }
//
//    private void Destroy() {
//        System.out.println("Destroy");
//    }
//    public String PlayMusic() {
//        return "Сейчас -  " + classicalMusic.getSong();
////        System.out.println("Сейчас -  " + classicalMusic.getSong());
////        System.out.println("Сейчас -  " + rockMusic.getSong());
//    }
//
////    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getVolume() {
//        return volume;
//    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }
}
