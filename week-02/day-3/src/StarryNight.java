import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics g) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)

        g.fillRect(0,0, 320, 320);

        for (int i = 0; i < 120; i++) {
            smallSquare(g);
        }

    }
    public static void smallSquare(Graphics g) {

        int r = (int)(80+(Math.random()*40));
        int gg = (int)(80+(Math.random()*40));
        int b = (int)(80+(Math.random()*40));
        Color someGray = new Color(r, gg, b);
        g.setColor(someGray);
        
        int x = (int)(Math.random()*321);
        int y = (int)(Math.random()*321);
        g.fillRect(x, y, 2, 2);
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
