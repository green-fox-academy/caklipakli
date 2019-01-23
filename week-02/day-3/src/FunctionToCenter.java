import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics g) {
        // Create a line drawing function that takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        Scanner scanner = new Scanner(System.in);

        g.setColor(Color.RED);
        System.out.println("Enter starting point x coordinate: ");
        int x = scanner.nextInt();
        System.out.println("Enter starting point y coordinate: ");
        int y = scanner.nextInt();
        toCenter(x, y, g);

        g.setColor(Color.BLACK);

        int n = 0;
        int m = 0;

        for (int i = 0; i < 16; i++) {
            toCenter(n, m, g);
            n = n + 20;
        }
        for (int i = 0; i < 16; i++) {
            toCenter(n, m, g);
            m = m + 20;}

        for (int i = 0; i < 16; i++) {
            toCenter(n, m, g);
            n = n - 20;}

        for (int i = 0; i < 16; i++) {
            toCenter(n, m, g);
            m = m - 20;}

    }
    public static void toCenter(int x, int y, Graphics g) {
            g.drawLine(x, y, 160, 160);
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
