import java.util.Arrays;

public class AppendA2 {
    public static void main(String[] args) {
        String[] nimals = {"kuty", "macsk", "cic"};

        for (int i = 0; i < nimals.length; i++) {
            nimals[i] += "a";
            System.out.print(nimals[i] + " ");
        }
    }
}
