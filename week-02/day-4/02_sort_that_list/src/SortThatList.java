import java.util.*;

public class SortThatList {
    public static void main(String[] args) {
        int[] input = {34, 12, 24, 9, 5};

        boolean cond = false;

        if (!cond) {
            sortA(input);
        } else {
            sortD(input);
        }
    }

    private static void sortA(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int x = array[i];
                    array[i] = array[j];
                    array[j] = x;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +  " ");
        }
    }

    private static void sortD(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int x = array[i];
                    array[i] = array[j];
                    array[j] = x;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +  " ");
        }
    }

}
