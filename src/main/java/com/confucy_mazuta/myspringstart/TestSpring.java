package com.confucy_mazuta.myspringstart;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("mettalMusic", Music.class);
        Music music2 = context.getBean("rockMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
        musicPlayer.PlayMusic();
        musicPlayer2.PlayMusic();
        musicPlayer.setVolume(199);
        System.out.println(musicPlayer.getVolume());
        context.close();



//        MettalMusic mettalMusic = context.getBean("musicBean", MettalMusic.class);
//        MettalMusic mettalMusic1 = context.getBean("musicBean", MettalMusic.class);
//        MettalMusic mettalMusic2 = context.getBean("musicBean", MettalMusic.class);
//
//        System.out.println(mettalMusic.getSong());
//        System.out.println(mettalMusic1.getSong());
//        System.out.println(mettalMusic2.getSong());


//        MusicPlayer firstMusicPlayer = classPathXmlApplicationContext.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = classPathXmlApplicationContext.getBean("musicPlayer", MusicPlayer.class);
//        firstMusicPlayer.PlayMusic();
//
//        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//
//        System.out.println(comparison);
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        firstMusicPlayer.setVolume(10);
//        secondMusicPlayer.setVolume(25);
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());



        context.close();
    }
}
