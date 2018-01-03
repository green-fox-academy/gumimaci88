public class Shifter implements CharSequence{
  String input;
  int shift;

  Shifter(String input, int shift) {
    this.input = input;
    this.shift = shift;
  }

  String getInput() {
    return this.input;
  }

  int getShift() {
    return this.shift;
  }

  @Override
  public int length() {
    return input.length();
  }

  @Override
  public char charAt(int index) {
    return input.charAt(index + shift);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return input.subSequence(start, end);
  }

  public static void main(String[] args) {
    Shifter s = new Shifter("example", 2);
    System.out.println(s.charAt(0));
    System.out.println(s.charAt(4));
  }
}
