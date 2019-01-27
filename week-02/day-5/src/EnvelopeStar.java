import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

    public static void mainDraw(Graphics g) {

        g.setColor(Color.GREEN);
        linesStar(g);

    }

    public static void linesStar(Graphics g){

        int space = 10;
        int linesCount = 16;
        int startX = WIDTH / 2;
        int startY = 0;
        int endY = HEIGHT / 2;
        int endX = startX;
        for (int i = 0; i < linesCount; i++) {
            g.drawLine(startX, startY, endX, endY);
            startY = startY + space;
            endX = endX + space;

        }

    }



    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}

