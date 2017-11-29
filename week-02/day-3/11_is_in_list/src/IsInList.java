import java.util.*;

public class IsInList {
    public static void main(String... args){
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));

        /*if (list.contains(4) && list.contains(8) && list.contains(12) && list.contains(16)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }*/

        int x = 0;

        for (int i = 0; i < list.size(); i++) {
            int y = list.get(i);
            if (y == 4 || y == 8 || y == 12 || y == 16) {
                x += 1;
            }
        }

        if (x == 4) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
