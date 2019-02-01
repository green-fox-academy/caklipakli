import org.omg.CORBA.portable.ValueOutputStream;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Sierpynsky {

    public static void mainDraw(Graphics g) {

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        int a = 2;
        int startX = 2;
        int startY = 2;

        int max = WIDTH / a / 2;
        drawPattern(g, startX, startY, a, max);
    }

    public static void drawSquare(Graphics g, int startX, int startY, int a){

        g.setColor(Color.BLACK);
        g.fillRect(startX, startY, a, a);

    }

    public static void drawPattern (Graphics g, int startX, int startY, int a, int max) {


        for (int j = 0; j < max; j++) {

            for (int i = 0; i < max; i++) {

                drawSquare(g, startX + i * a * a, startY+ j * a * a, a);

                drawSquare(g, startX + i * a * a, startY + j * a * a, a);

            }
        }

        a = a * a;
        startX = startX + 2 * a;
        startY = startY + 2 * a;
        max = max / 2;

        if (a < WIDTH ) {
            drawPattern(g, startX, startY, a, max);
        }
        else {
            return;
        }
    }

    // Don't touch the code below
    static int WIDTH = 640;
    static int HEIGHT = 640;

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

