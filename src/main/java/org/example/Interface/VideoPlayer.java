package org.example.Interface;

public class VideoPlayer implements Playable {
    @Override
    public String play() {
        System.out.println("Playing video");
        return "Playing video";
    }
}
