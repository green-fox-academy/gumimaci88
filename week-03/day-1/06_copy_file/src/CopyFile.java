import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFile {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter the location of the file you'd like to copy: ");
    String fileToCopy = input.nextLine();

    System.out.println("Please enter the location where you'd like to copy the previous file: ");
    String whereToCopy = input.nextLine();

    System.out.println(funcCopyFile(fileToCopy, whereToCopy));

  }

  private static boolean funcCopyFile(String inputSource, String inputDestination) {
    boolean cond = true;
    Path pathSource = Paths.get(inputSource);
    Path pathDestination = Paths.get(inputDestination);
    try {
      List<String> content = new ArrayList<>();
      content = Files.readAllLines(pathSource);
      Files.write(pathDestination, content);
    } catch (Exception e) {
      cond = false;
    }
    return cond;
  }
}