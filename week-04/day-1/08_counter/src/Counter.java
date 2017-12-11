public class Counter {
  int defaultValue = 0;
  int counterValue;

  public Counter() {
    this.counterValue = defaultValue;
  }

  public Counter (int input) {
    this.defaultValue = input;
    counterValue = input;
  }

  public void add (int number) {
    counterValue += number;
  }

  public void add() {
    counterValue += 1;
  }

  public int get() {
    return counterValue;
  }

  public void reset() {
    counterValue = defaultValue;
  }

}
