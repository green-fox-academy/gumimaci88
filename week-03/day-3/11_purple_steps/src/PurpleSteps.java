import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps{

  public static void mainDraw(Graphics graphics){
    int size = 10;
    int x = 10;
    Color purple = new Color(176, 78, 240);
    for (int i = 0; i < WIDTH; i+=size) {
      graphics.setColor(purple);
      graphics.fillRect(x, x, size, size);
      graphics.setColor(Color.BLACK);
      graphics.drawRect(x, x, size, size);
      x = x +size;
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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }
}