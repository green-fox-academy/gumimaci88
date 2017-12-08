import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid{

  public static void mainDraw(Graphics graphics) {
    drawFinal(graphics, WIDTH/2, WIDTH/2,15, 200,4);
  }

  private static void drawFinal(Graphics gr, int inputX, int inputY, int thick, int length, int n) {
    if (n == 0) {
      return;
    }
    drawSquare(gr, inputX, inputY, thick, length);

    int tempX1 = inputX + length/2;
    int tempX2 = inputX - length/2;
    int tempY1 = inputY + length/2;
    int tempY2 = inputY - length/2;

    drawFinal(gr, tempX1, tempY1, thick/2, length/2, n-1);
    drawFinal(gr, tempX1, tempY2, thick/2, length/2, n-1);
    drawFinal(gr, tempX2, tempY1, thick/2, length/2, n-1);
    drawFinal(gr, tempX2, tempY2, thick/2, length/2, n-1);

  }

  private static void drawSquare(Graphics gr, int inputX, int inputY, int thick, int length) {
    Graphics2D gr2 = (Graphics2D) gr;
    gr2.setStroke(new BasicStroke(thick));
    gr2.drawRect(inputX-length/2, inputY-length/2, length, length);
  }


  static int WIDTH = 400;
  static int HEIGHT = 400;

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