import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawALotOfSquares {

    public static void mainDraw(Graphics g) {

        g.setColor(Color.yellow);

        g.fillRect(0, 0, WIDTH, HEIGHT);
        g.setColor(Color.BLACK);

        drawSquares(g, 0, 0, 1);

    }

    public static void drawSquares(Graphics g, int x, int y, int divide){


            int side = WIDTH / divide;

            if (side > 30) {

                for (int i = 0; i < divide ; i++) {

                    for (int j = 0; j < divide; j++) {

                        g.drawRect(x + j * side, y + i * side, side, side);
                    }


                }
                drawSquares(g, x , y , divide * 3);}



            else {
                return;
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

