package org.example.nail;

import org.example.nail.Music;

import java.util.List;

public class MusicPlayer {
    private List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        for (Music m : musicList) {
            System.out.println("Playng: " + m.getSong());
        }
    }
}
