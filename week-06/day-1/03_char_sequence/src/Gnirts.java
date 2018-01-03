public class Gnirts implements CharSequence{
  String input;

  Gnirts(String input) {
    this.input = input;
  }

  public String getInput() {
    return this.input;
  }

  @Override
  public int length() {
    return input.length();
  }

  @Override
  public char charAt(int index) {
    return input.charAt(input.length() - index - 1);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return input.subSequence(input.length() - end, input.length() - start);
  }

  public static void main(String[] args) {
    Gnirts g = new Gnirts("example");
    System.out.println(g.charAt(1));
    System.out.println(g.subSequence(3,7));
  }
}
