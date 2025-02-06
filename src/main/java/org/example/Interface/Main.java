package org.example.Interface;

public class Main {
    public static void main(String[] args) {
        Playable musicPlayer = new MusicPlayer();
        Playable videoPlayer = new VideoPlayer();

        MediaController mediaController = new MediaController();

        mediaController.playMedia(musicPlayer);
        mediaController.playMedia(videoPlayer);
    }
}
