import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        try {
            Path myFilePath = Paths.get("myfile.txt");
            List<String> lines = Files.readAllLines(myFilePath);
            for (String eachLineOfLines : lines) {
                System.out.println(eachLineOfLines);
            }
        } catch (Exception e) {
            System.out.println("Unable to read file: my-file.txt");
        }
    }
}