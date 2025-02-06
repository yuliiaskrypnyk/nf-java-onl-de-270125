package org.example.Interface;

public class MusicPlayer implements Playable {
    @Override
    public String play() {
        System.out.println("Playing song");
        return "Playing song";
    }
}
