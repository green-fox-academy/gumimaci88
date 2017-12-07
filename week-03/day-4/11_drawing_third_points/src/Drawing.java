import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {

  public static void mainDraw(Graphics graphics) {
  drawFinal(graphics, 300, 300, WIDTH);
  }

  private static void drawFinal (Graphics gr, int inputX, int inputY, int size) {
    if (size < (WIDTH/273)) {
      return;
    } else {
      drawLines(gr, inputX, inputY, size);

      int tempX1 = inputX + size/3;
      int tempY1 = inputY + size/3;
      int tempX2 = inputX - size/3;
      int tempY2 = inputY - size/3;

      drawFinal(gr, inputX, tempY1, size/3);
      drawFinal(gr, inputX, tempY2, size/3);
      drawFinal(gr, tempX1, inputY, size/3);
      drawFinal(gr, tempX2, inputY, size/3);
    }
  }

  private static void drawLines (Graphics gr, int x, int y, int size) {
    gr.drawLine(x + size/6, y + size/2, x + size/6, y - size/2);
    gr.drawLine(x - size/6, y + size/2, x - size/6, y - size/2);
    gr.drawLine(x - size/2, y - size/6, x + size/2, y - size/6);
    gr.drawLine(x - size/2, y + size/6, x + size/2, y + size/6);
  }


  static int WIDTH = 600;
  static int HEIGHT = 600;

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
      this.setBackground(Color.YELLOW);

    }
  }

}