import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {

  public static void mainDraw(Graphics graphics) {
    int size = 30;
    int x = 0;
    int y = 0;
    graphics.setColor(Color.BLACK);
    for (int i = 0; i < WIDTH; i += size) {
      if (y % (size*2) == 0) {
        for (int j = 0; j < WIDTH; j += size*2) {
          graphics.fillRect(x, y, size, size);
          x += size * 2;
        }
      } else {
        x = x + size;
        for (int j = 0; j < WIDTH; j += size*2) {
          graphics.fillRect(x, y, size, size);
          x += size * 2;
        }
      }
      x = 0;
      y += size;
    }
  }

  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
      this.setBackground(Color.WHITE);

    }
  }

}