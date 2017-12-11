public class Main {
  public static void main(String[] args) {
    Sharpie example = new Sharpie("silver", 200);
    System.out.println(example.inkAmount);

    example.use(50);
    System.out.println(example.inkAmount);

  }
}
