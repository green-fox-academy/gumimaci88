import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter the path where the file is located: ");
    String filePath = input.nextLine();

    System.out.println("Please enter the word you'd like to write to the file: " );
    String wordInFile = input.nextLine();

    System.out.println("Please enter the number of lines there supposed to be in the file: ");
    int numberLines = input.nextInt();

    multipleLinesInFile(filePath, wordInFile, numberLines);

  }

  private static String multipleLinesInFile(String inputPath, String inputWord, Integer inputLines) {
    try {
      List<String> content = new ArrayList<>();
      for (int i = 0; i < inputLines; i++) {
        content.add(inputWord);
      }
      Files.write(Paths.get(inputPath), content);
    } catch (Exception e) {
      System.out.println();
    }
  return inputPath;
  }
}