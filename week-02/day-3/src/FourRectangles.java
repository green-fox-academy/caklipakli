import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics g){
        // draw four different size and color rectangles.
        // avoid code duplication.

        int red = 100;
        int h = 10;
        int x = 10;
        int y = 10;
        int w = 10;
        int green = 0;
        int blue = 0;

        for (int i = 0; i < 4; i++) {
            g.setColor(new Color(red, green, blue));
            g.fillRect(x, y, w, h);
            x = x + 30;
            y = y + 40;
            w = w + 10;
            h = h + 20;
            red = red + 25;
            green = green + 30;

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
