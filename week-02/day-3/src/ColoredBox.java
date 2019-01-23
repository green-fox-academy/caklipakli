import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics g) {
        // Draw a box that has different colored lines on each edge.
        g.setColor(Color.DARK_GRAY);
        g.drawLine(20, 50, 300, 50);
        g.setColor(Color.yellow);
        g.drawLine(20, 50, 20, 250);
        g.setColor(Color.RED);
        g.drawLine(20, 250, 300, 250);
        g.setColor(Color.BLUE);
        g.drawLine(300, 50, 300, 250);


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
