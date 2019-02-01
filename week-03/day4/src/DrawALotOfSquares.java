import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawALotOfSquares {

    public static void mainDraw(Graphics g) {

        g.setColor(Color.yellow);

        g.fillRect(0, 0, WIDTH, HEIGHT);
        g.setColor(Color.BLACK);

        drawPattern(g, 0, 0, 3, WIDTH);

    }

    public static void drawLines(Graphics g, int x, int y, int divide, int width){

            int space = width / divide;

            g.drawLine(x + space, y, x + space, width);
            g.drawLine(x + 2 * space, y, x +  2 * space, width);
            g.drawLine(x , y + space, width, y + space);
            g.drawLine(x , y + 2 * space, width, y + 2 * space);

    }
    public static void drawPattern(Graphics g, int x, int y, int divide, int width) {

        drawLines(g, x, y, divide, width);

        width = width / 3;

        drawLines(g, x + width, y + width, divide, width);

        //drawLines(g, x , y + width, divide, width);

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

