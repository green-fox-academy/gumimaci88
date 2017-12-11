public class Teacher {
  String answer;

  public Teacher() {

  }

  public String teach(Student pupil) {
    System.out.println("Can you solve this exercise?");
    return pupil.learn();
  }

  public String answer() {
    return answer = "Solve it on your own.";
  }

}
