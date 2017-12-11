import java.awt.*;

public class Main {
  public static void main(String[] args) {
    PostIt postIt1 = new PostIt();
    PostIt postIt2 = new PostIt();
    PostIt postIt3 = new PostIt();

    postIt1.setBackgroundColor(Color.ORANGE);
    postIt1.setText("Idea 1");
    postIt1.setTextColor(Color.BLUE);

    postIt2.setBackgroundColor(Color.PINK);
    postIt2.setText("Awesome");
    postIt2.setTextColor(Color.BLACK);

    postIt3.setBackgroundColor(Color.YELLOW);
    postIt3.setText("Superb!");
    postIt3.setTextColor(Color.GREEN);

  }
}
