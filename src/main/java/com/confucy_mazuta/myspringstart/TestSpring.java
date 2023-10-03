package com.confucy_mazuta.myspringstart;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//       Music music = classPathXmlApplicationContext.getBean("musicBean", Music.class);

//
//
        MusicPlayer musicPlayer = classPathXmlApplicationContext.getBean("musicPlayer", MusicPlayer.class);



        musicPlayer.PlayMusic();
        classPathXmlApplicationContext.close();
    }
}
