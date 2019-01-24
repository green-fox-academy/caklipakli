import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

    public static void mainDraw(Graphics g){

        int[][] a = {{10,320}, {70,320}, {130,320}, {190,320},{250,320}};
        int[][] b = {{70,320}, {130,320}, {190,320}, {250,320}, {310,320}};
        int[][] c = {{40,280}, {100,280}, {160,280}, {220,280}, {280,280}};

        int d = a.length;

        for (int i = 0; i < a.length; i++) {

            triangleDraw(a, b, c, d, g);
            d = d - 1;
        }
    }

    public static void triangleDraw(int[][] a, int[][] b, int[][] c, int d, Graphics g) {

        for (int i = 0; i < d; i++) {

            g.drawLine(a[i][0], a[i][1], b[i][0], b[i][1]);
            g.drawLine(b[i][0], b[i][1], c[i][0], c[i][1]);
            g.drawLine(c[i][0], c[i][1], a[i][0], a[i][1]);
        }

        for (int i = 0; i < a.length; i++){
            a[i][0] = a[i][0] + 30;
            b[i][0] = b[i][0] + 30;
            c[i][0] = c[i][0] + 30;
            a[i][1] = a[i][1] - 40;
            b[i][1] = b[i][1] - 40;
            c[i][1] = c[i][1] - 40;

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