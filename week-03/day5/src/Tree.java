import org.omg.CORBA.portable.ValueOutputStream;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Tree {

    public static void mainDraw(Graphics g) {

        int a = 50;
        int b = 40;
        int startX = WIDTH / 2;
        int startY = HEIGHT;

        g.drawLine(startX, startY, startX, startY - a);
        startY = startY - a;

        drawLines(g, startX, startY, a, b);
        drawShape(g, startX, startY, a, b);

    }

    public static void drawLines(Graphics g, int startX, int startY, int a, int b){

        g.drawLine(startX, startY, startX, startY - a);
        g.drawLine(startX, startY, startX - a / 3, startY - b);
        g.drawLine(startX, startY, startX + a / 3, startY - b);
    }
    public static void drawShape(Graphics g, int startX, int startY, int a, int b) {

        drawLines(g, startX, startY - a, a, b);
        drawLines(g, startX - a / 3, startY - b, a, b);
        drawLines(g, startX + a / 3, startY - b, a, b);

        

        if ( startY > 5 ) {

            drawShape(g, startX, startY - a, a, b);
            drawShape(g, startX - a / 3, startY - b, a, b);
            drawShape(g, startX + a / 3, startY - b, a, b);
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
