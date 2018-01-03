import java.util.Collections;

public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();

    ToDo task1 = new ToDo("Get milk");
    ToDo task2 = new ToDo("Remove the obstacles");
    ToDo task3 = new ToDo ("Stand up") ;
    ToDo task4 = new ToDo ("Eat lunch");
    ToDo task5 = new ToDo ("Grab a beer");
    ToDo task6 = new ToDo ("Have a dessert");

    task3.setCompleted();
    task4.setCompleted();
    task6.setCompleted();

    fleet.add(task1);
    fleet.add(task2);
    fleet.add(task3);
    fleet.add(task4);
    fleet.add(task5);
    fleet.add(task6);

    Collections.sort(fleet.getThings());
    System.out.println(fleet.toString());
  }
}
