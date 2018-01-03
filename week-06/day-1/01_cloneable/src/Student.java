public class Student implements Cloneable {
  String name;
  int age;
  String gender;
  String institution;

  Student(String name, int age, String gender, String institution) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.institution = institution;
  }

  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

}
