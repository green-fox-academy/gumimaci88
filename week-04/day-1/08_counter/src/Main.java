public class Main {
  public static void main(String[] args) {
    Counter example = new Counter(77);

    System.out.println(example.defaultValue);
    System.out.println(example.counterValue);

    example.add();
    System.out.println(example.counterValue);

    example.add(22);
    System.out.println(example.counterValue);

    example.reset();
    System.out.println(example.counterValue);

  }
}
