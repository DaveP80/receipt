package com.logic;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;

public class SimpleImageLoad extends Frame {

    Image img;

    public SimpleImageLoad() {

        try {

            File imageFile = new File("programming-code-icon-made-with-binary-code-coding-hacker-matrix-background-with-digits-1-0_127544-1141.jpg");
            // Load the image.
            img = ImageIO.read(imageFile);
        } catch (IOException exc) {
            System.out.println("cannot load image file.");
            System.exit(0);
        }

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
            }
        });
    }

    public void paint(Graphics g) {
        g.drawImage(img, getInsets().left, getInsets().top, null);
    }
}