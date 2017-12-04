import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class CountLines {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a filename: ");
        String file = input.nextLine();
        numberoflines(file);

    }

    private static Integer numberoflines(String input) {
        int numberLines = 0;
        try {
            Path filePath = Paths.get(input);
            List<String> lines = Files.readAllLines(filePath);
            numberLines = lines.size();
            System.out.println(numberLines);
        } catch (Exception e) {
            System.out.println();
        }
        return numberLines;
    }
}
