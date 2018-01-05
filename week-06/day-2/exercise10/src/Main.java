import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Fox Angela = new Fox("Angela", "pallida", "green");
    Fox Benjamin = new Fox("Benjamin", "pallida", "blue");
    Fox Charlie = new Fox("Charlie", "corsac", "green");
    Fox Dorothy = new Fox("Dorothy", "corsac", "white");
    Fox Ferdinand = new Fox("Ferdinand", "pallida", "green");

    List<Fox>  gangOfFoxes = new ArrayList<>();
    gangOfFoxes.add(Angela);
    gangOfFoxes.add(Benjamin);
    gangOfFoxes.add(Charlie);
    gangOfFoxes.add(Dorothy);
    gangOfFoxes.add(Ferdinand);

    System.out.println("These foxes are green:");

    gangOfFoxes
            .stream()
            .filter(p -> p.getColor().equals("green"))
            .forEach(p -> System.out.println(p.getName()));

    System.out.println("These foxes are green and pallida type:");

    gangOfFoxes
            .stream()
            .filter(p -> p.getColor().equals("green") && p.getType().equals("pallida"))
            .forEach(p -> System.out.println(p.getName()));
  }
}
