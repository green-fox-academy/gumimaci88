import java.util.*;

public class Unique {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 11, 11, 34, 11, 52, 61, 1, 34, 7, 9, 52, 0));
        System.out.println(uniq(input));
    }

    public static ArrayList<Integer> uniq(ArrayList<Integer> inputUniq) {
        ArrayList<Integer> output = new ArrayList<Integer>();
        for (int i = 0; i < inputUniq.size() ; i++) {
            boolean cond = false;
            for (int j = 0; j < output.size() && !cond; j++) {
                if (output.get(j).equals(inputUniq.get(i))) {
                    cond = true;
                }
            }
            if (!cond) {
                output.add(inputUniq.get(i));
            }
        }

        return output;
    }
}
