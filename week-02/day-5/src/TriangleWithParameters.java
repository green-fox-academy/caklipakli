import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TriangleWithParameters {

    public static void mainDraw(Graphics g){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a side of a triangle: ");
        int aSide = scanner.nextInt();
        double height = aSide * 0.87;
        int bSide = (int) height;
        int width = WIDTH;
        int b = aSide;
        int c = width-bSide;

        int[][] triangleA = {{0, width}};
        int[][] triangleB = {{b, width}};
        int[][] triangleC = {{aSide /2, c}};

        int maxIterations = (width / aSide)-1;
        int floor = maxIterations;

            for (int i = 0; i < floor; i ++) {

                triangleDraw(triangleA, triangleB, triangleC, maxIterations, aSide, g);

                maxIterations = maxIterations - 1;

                triangleA[0][0] = triangleC[0][0];
                triangleA[0][1] = triangleC[0][1];
                triangleB[0][0] = triangleC[0][0] + aSide;
                triangleB[0][1] = triangleC[0][1];
                triangleC[0][0] = triangleC[0][0] + aSide / 2;
                triangleC[0][1] = triangleC[0][1] - bSide;
            }

    }

    public static void triangleDraw(int[][] a, int[] b, int[]c, int max, int aSide, Graphics g){

        for (int j = 0; j < max; j++) {

            g.drawLine(a[0][0], a[0][1], b[0][0], b[0][1]);
            g.drawLine(b[0][0], b[0][1], c[0][0], c[0][1]);
            g.drawLine(c[0][0], c[0][1], a[0][0], a[0][1]);

        }
    }

    public static void triangleDraw2(int side, Graphics g) {

            int a1 = WIDTH/ 2;
            int a2 = 0;
            int b1 = a1 - side/2;
            int b2 = side;
            int c1 = a1 + side/2;
            int c2 = side;
            int max = WIDTH / side -1;

           for (int i = 0; i < max; i++) {

               for (int j = 0; j < max; j++) {

                    g.drawLine(a1, a2, b1, b2);
                    g.drawLine(b1, b2, c1, c2);
                    g.drawLine(c1, c2, a1, a2);

               }

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
