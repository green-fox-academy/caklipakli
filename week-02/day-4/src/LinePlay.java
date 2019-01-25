import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {

    public static void mainDraw (Graphics g) {

        g.setColor(Color.magenta);

        int x1 = 30;
        int y2 = 20;

        for (int i = 0; i < 14; i++) {
            g.drawLine(x1, 0, WIDTH, y2);
            x1 = x1 + 20;
            y2 = y2 + 20;
        }
        g.setColor(Color.GREEN);

        int y1 = 30;
        int x2 = 20;

        for (int i = 0; i < 14; i++) {
            g.drawLine(0, y1, x2, HEIGHT);
            y1 = y1 + 20;
            x2 = x2 + 20;
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