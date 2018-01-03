public class ToDo implements Comparable<ToDo> {
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
  public int compareTo(ToDo o) {
    boolean completionStatus = o.completed;
    String descriptionStatus = o.description;
    if (this.completed && !completionStatus) {
      return -1;
    } else if (!this.completed && completionStatus) {
      return 1;
    } else {
      return this.description.compareTo(descriptionStatus);
    }
  }
}
