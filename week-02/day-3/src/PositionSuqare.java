import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSuqare {

    public static void mainDraw(Graphics g){
        // create a square drawing function that takes 3 parameters:
        // the x and y coordinates of the square's top left corner and the graphics
        // and draws a 50x50 square from that point.
        // draw 3 squares with that function.
        // avoid code duplication.
        Scanner scanner = new Scanner(System.in);
        g.setColor(new Color(200, 100,0));

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter x coordinate: ");
            int x = scanner.nextInt();
            System.out.println("Enter y coordinate: ");
            int y = scanner.nextInt();
            drawSquare(x, y, g);
        }

    }

    public static void drawSquare(int x, int y, Graphics g){
            g.fillRect(x, y, 50, 50);
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
