import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

  public static void mainDraw(Graphics graphics){
    int r=0;
    int g=0;
    int b=0;
    int x=0;
    int w=WIDTH;

    while (w>0) {
      r=(int)(Math.random()*255);
      g=(int)(Math.random()*255);
      b=(int)(Math.random()*255);
      x=(int)(Math.random()*WIDTH);
      drawRainbowSquares(graphics, x, new Color(r, g, b));
      w=w-x;
    }
  }

  private static void drawRainbowSquares(Graphics gr, int size, Color col) {
    gr.setColor(col);
    gr.fillRect(WIDTH/2 - size/2, WIDTH/2 -size/2, size, size);
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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }
}