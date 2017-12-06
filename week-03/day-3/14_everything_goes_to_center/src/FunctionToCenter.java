import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {

  public static void mainDraw(Graphics graphics) {

    int position = 20;
    for (int i = 0; i <= WIDTH; i+= position) {
      if (i % WIDTH == 0 && i <= WIDTH) {
        int y = i;
        for (int j = 0; j < WIDTH / position; j++) {
          drawLine(graphics, j * position, y);
          drawLine(graphics, y, j * position);
        }
      }
    }
  }

  private static void drawLine(Graphics gr, int inputX, int inputY) {
    gr.drawLine(inputX, inputY, WIDTH / 2, WIDTH / 2);
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

    }
  }

}