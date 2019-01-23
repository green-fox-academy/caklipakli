import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

    public static void mainDraw(Graphics g) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size ");
        int w = scanner.nextInt();
        int c = (int)(Math.random() * 100);

        for (int i = 0; w < 320; i++) {

            drawSquareCenter(w, c, g);
            w = w + 10;
            c = (int)(Math.random() * 100);
        }

    }
    public static void drawSquareCenter(int w, int c, Graphics g){
        g.setColor(new Color(c, c +10, c + 20 ));
        g.drawRect(160-(w/2), 160-w/2, w, w);
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