public class ToDo implements Printable{
  String description;
  boolean completed;

  public ToDo(String name) {
    this.description = name;
  }

  public void setCompleted() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + description;
  }

  @Override
  public void printAllFields() {
    System.out.println(toString());
  }
}
