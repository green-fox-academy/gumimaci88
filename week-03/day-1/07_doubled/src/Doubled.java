import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
  public static void main(String[] args) {
    String file = "duplicated-chars.txt";
    System.out.println(undoubleFile(file));
  }

  private static String undoubleFile(String input) {
    List<String> inputFile = new ArrayList<>();

    try {
      inputFile = Files.readAllLines(Paths.get(input));
    } catch (Exception e) {
      System.out.println();
    }
    String temp = String.join("", inputFile);
    String[] tempList = temp.split("");
    String[] list = new String[temp.length()/2];
    int j = 0;
    for (int i = 0; i < temp.length()/2; i++) {
      list[i] = tempList[j];
      j = j+2;
    }
    String result = String.join("", list);
    return result;
  }
}