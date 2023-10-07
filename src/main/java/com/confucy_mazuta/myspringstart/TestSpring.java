package com.confucy_mazuta.myspringstart;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer firstMusicPlayer = classPathXmlApplicationContext.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = classPathXmlApplicationContext.getBean("musicPlayer", MusicPlayer.class);
        firstMusicPlayer.PlayMusic();

        boolean comparison = firstMusicPlayer == secondMusicPlayer;

        System.out.println(comparison);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);

        firstMusicPlayer.setVolume(10);
        secondMusicPlayer.setVolume(25);
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());



        classPathXmlApplicationContext.close();
    }
}
