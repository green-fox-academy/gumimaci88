public class Main {
  public static void main(String[] args) {
    Student hieu = new Student();
    Teacher mark = new Teacher();

    System.out.println(mark.teach(hieu));
    System.out.println();
    System.out.println(hieu.question(mark));
  }
}
