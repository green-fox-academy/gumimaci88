public class Student {
  String knowledge;

  public Student() {

  }

  public String learn() {
    return knowledge = "Of course I know, stick to the obvious.";
  }

  public String question(Teacher professor) {
    System.out.println("Please help me Mark.");
    return professor.answer();
  }

}
