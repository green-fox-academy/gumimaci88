public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    Thing task1 = new Thing("Get milk");
    Thing task2 = new Thing("Remove the obstacles");
    Thing task3 = new Thing("Stand up");
    Thing task4 = new Thing("Eat lunch");

    task3.complete();
    task4.complete();

    fleet.add(task1);
    fleet.add(task2);
    fleet.add(task3);
    fleet.add(task4);

    fleet.toString();

    System.out.println(fleet);
  }
}