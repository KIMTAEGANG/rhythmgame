package com.rhythm.game;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RhythmGameApplication {
    public static final int SCREEN_WIDTH = 1280;
    public static final int SCREEN_HEIGHT = 720;

    public static void main(String[] args) {
        new DynamicBeat();
    }

}
