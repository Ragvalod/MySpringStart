package com.confucy_mazuta.myspringstart;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = classPathXmlApplicationContext.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.PlayMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        classPathXmlApplicationContext.close();
    }
}
