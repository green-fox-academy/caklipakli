import org.omg.CORBA.portable.ValueOutputStream;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Tree {

    public static void mainDraw(Graphics g) {

        int a = 50;
        int startX = WIDTH / 2;
        int startY = HEIGHT;

        g.drawLine(startX, startY, startX, startY - a);
        startY = startY - a;
        
        drawLines(g, startX, startY, a);
        drawShape(g, startX, startY, a);

    }

    public static void drawLines(Graphics g, int startX, int startY, int a){

        g.drawLine(startX, startY, startX, startY - a);
        g.drawLine(startX, startY, startX - a / 2, startY - a);
        g.drawLine(startX, startY, startX + a / 2, startY - a);
    }
    public static void drawShape(Graphics g, int startX, int startY, int a) {


        if ( startX > 0 ) {
            drawLines(g, startX, startY - a, a);
            drawLines(g, startX - a / 2, startY - a, a);
            drawLines(g, startX + a / 2, startY -a, a);
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
