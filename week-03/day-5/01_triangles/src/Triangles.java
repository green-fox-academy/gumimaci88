import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

  public static void mainDraw(Graphics graphics) {
    drawFinal(graphics, WIDTH/2, WIDTH/2, 400,7);
  }

  private static void drawFinal(Graphics gr, double inputX, double inputY, int length, int n) {
    if (n == 0) {
      return;
    }
    drawTriangle(gr, inputX, inputY, length);

    double height = Math.sqrt(3.0)/2*length;

    double x1 = inputX + length/4;
    double x2 = inputX - length/4;
    double y1 = inputY - height/4;
    double y2 = inputY + height/4;

    drawFinal(gr, x1, y1, length/2, n-1);
    drawFinal(gr, x2, y1, length/2, n-1);
    drawFinal(gr, inputX, y2, length/2, n-1);

  }

  private static void drawTriangle(Graphics gr, double x, double y, int length) {
    double height = Math.sqrt(3.0)/2*length;
    double tempX1 = x + length/2;
    double tempX2 = x - length/2;
    double tempY1 = y - height/2;
    double tempY2 = y + height/2;
    int[] coorX = {(int)tempX1, (int)tempX2, (int)x};
    int[] coorY = {(int)tempY1, (int)tempY1, (int)tempY2};
    gr.drawPolygon(coorX, coorY, coorX.length);
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