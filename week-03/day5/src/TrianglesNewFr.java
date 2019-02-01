import org.omg.CORBA.portable.ValueOutputStream;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TrianglesNewFr {

    public static void mainDraw(Graphics g) {

        g.drawLine(5, 5, WIDTH-5, 5);
        g.drawLine(WIDTH-5, 5, WIDTH / 2, HEIGHT-5);
        g.drawLine(WIDTH / 2, HEIGHT-5, 5, 5);



        int a = (WIDTH-10) / 2;
        int h = (HEIGHT - 10) / 2;
        int startY = 5;
        int startX = WIDTH / 2;

            drawTriangle(g, startX, startY, a, h);
            drawTriangles(g, startX, startY, a, h);

    }

    public static void drawTriangle(Graphics g, int startX, int startY, int a, int h){

        g.drawLine(startX, startY, startX - a/2, startY + h);
        g.drawLine(startX - a/2, startY + h, startX + a/2, startY + h);
        g.drawLine(startX + a/2, startY + h, startX, startY);

    }

    public static void drawTriangles (Graphics g, int startX, int startY, int a, int h) {

        drawTriangle(g, startX - a / 2, startY, a / 2, h / 2);
        drawTriangle(g, startX + a / 2, startY, a / 2, h / 2);
        drawTriangle(g, startX, startY + h, a / 2, h / 2);

        

        if (a > 1) {

        drawTriangles(g, startX- a / 2, startY, a / 2, h /2);
        drawTriangles(g, startX + a / 2, startY, a / 2, h / 2);
        drawTriangles(g, startX, startY + h, a / 2, h / 2);
        }

        else {
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
