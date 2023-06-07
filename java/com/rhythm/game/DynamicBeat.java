package com.rhythm.game;

import javax.swing.*;
import java.awt.*;

public class DynamicBeat extends JFrame {

    private Image screenImage;
    private Graphics screenGraphic;
    private Image introBackground;
    public DynamicBeat() {
        setTitle("Dynamic Beat");
        setSize(RhythmGameApplication.SCREEN_WIDTH, RhythmGameApplication.SCREEN_HEIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


        introBackground = new ImageIcon(RhythmGameApplication.class.getResource("/image/introBackground.jpg")).getImage();
    }

    public void paint(Graphics g) {
        screenImage = createImage(RhythmGameApplication.SCREEN_WIDTH, RhythmGameApplication.SCREEN_HEIGHT);
        screenGraphic = screenImage.getGraphics();
        screenDraw(screenGraphic);
        g.drawImage(screenImage, 0, 0, null);
    }

    public void screenDraw(Graphics g) {
        g.drawImage(introBackground, 0, 0, null);
        this.repaint();
    }

}
