package org.example.nail;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ClassicalMusic implements Music {

    private List<String> listMusic;


    @Override
    public String getSong() {
        return "";
    }

    public static class TestSpring {
        public static void main(String[] args) {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
            MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
            musicPlayer.playMusic();

            context.close();
        }
    }
}
