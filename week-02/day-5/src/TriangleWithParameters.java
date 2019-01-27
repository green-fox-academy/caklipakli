import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TriangleWithParameters {

    public static void mainDraw(Graphics g) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a side of a triangle: ");
        int aSide = scanner.nextInt();
        double height = aSide * 0.87;
        int bSide = (int) height;
        int width = WIDTH;
        int b = aSide;
        int c = width - bSide;

        int[][] triangleA = {{0, width}};
        int[][] triangleB = {{b, width}};
        int[][] triangleC = {{aSide / 2, c}};

        int maxIterations = (width / aSide);

        triangleDraw(triangleA, triangleB, triangleC, maxIterations, aSide, bSide, g);

    }

    public static void triangleDraw(int[][] a, int[][] b, int[][] c, int max, int aSide, int bSide, Graphics g){

        int floor = max;

        for (int i = 0; i < floor; i++) {

            for (int j = 0; j < max; j++) {

                g.drawLine(a[0][0] + j * aSide + i * aSide/2, a[0][1] - i * bSide,
                           b[0][0] + j * aSide + i * aSide/2, b[0][1] - i * bSide);
                g.drawLine(b[0][0] + j * aSide + i * aSide/2, b[0][1] - i * bSide,
                           c[0][0] + j * aSide + i * aSide/2, c[0][1] - i * bSide);
                g.drawLine(c[0][0] + j * aSide + i * aSide/2, c[0][1] - i * bSide,
                           a[0][0] + j * aSide + i * aSide/2, a[0][1] - i * bSide);

            }
            max = max -1;

        }
    }



    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

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
