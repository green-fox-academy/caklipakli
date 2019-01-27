import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {

    public static void mainDraw(Graphics g) {

        int n = 6;
        int a = 30;
        int xPoints[] = {a, a+a, a+3*a/2, a+a, a, a-a/2};
        int yPoints[] = {0, 0, a*8/10, a*8/5, a*8/5, a*8/10};
        g.drawPolygon(xPoints, yPoints, n);



    }

    //public static void hexagon(Graphics g, int[] xPoints, int[] yPoints, int n){

      //  g.drawPolygon(xPoints, yPoints, n);
    //}



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


