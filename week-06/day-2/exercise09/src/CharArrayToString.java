import java.util.stream.Collectors;

public class CharArrayToString {
  public static void main(String[] args) {
    char[] characters = {'g', 'u', 'm', 'i', 'm', 'a', 'c', 'i'};
    String word;

    word = new String(characters)
            .chars()
            .mapToObj(c -> Character.toString((char) c))
            .collect(Collectors.joining());

    System.out.println(word);
    System.out.println(convertToString(characters));
  }

  public static String convertToString(char[] inputCharacters) {
    return new String(inputCharacters);
  }
}
