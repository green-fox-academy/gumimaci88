import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();

    System.out.println(sortDomino(dominoes));
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }

  private static List<Domino> sortDomino(List<Domino> input) {
    for (int i = 0; i < input.size(); i++) {
      for (int j = i; j < input.size(); j++) {
        if (input.get(i).getValues()[1] == input.get(j).getValues()[0]) {
          input.add(i+1, input.get(j));
          input.remove(j+1);
        }
      }
    }
    return input;
  }

}
