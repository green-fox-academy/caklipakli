import org.omg.CORBA.portable.ValueOutputStream;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TrianglesFractals {

    public static void mainDraw(Graphics g) {

        int startX = 5;
        int startY = 5;
        int a = WIDTH - 10;
        int h = HEIGHT -10;


        int xPoints[] = {startX, startX + a, startX + a/2};
        int yPoints[] = {startY, startY, h};

        g.drawPolygon(xPoints, yPoints, 3);

        a = a / 2;
        h = h / 2;
        startX = startX + a;

        int xPoints2[] = {startX, startX - a/2, startX + a/2};
        int yPoints2[] = {startY, h, h};

        triangle(g, xPoints2, yPoints2, a, h, startX, startY);


    }

    public static void triangle(Graphics g, int[] xPoints, int[] yPoints, int a, int h, int startX, int startY){

        if (a > 5) {
            g.drawPolygon(xPoints, yPoints, 3);

            a = a / 2;
            h = h / 2;
            startX = startX + a;

            for (int i = 0; i < 3; i++) {


                int xPoints2[] = {startX , startX - a / 2, startX + a / 2};
                int yPoints2[] = {startY, h, h};

                triangle(g, xPoints2, yPoints2, a, h, startX, startY);

            }
        } else {
            return;
        }

    }


    // Don't touch the code below
    static int WIDTH = 380;
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
