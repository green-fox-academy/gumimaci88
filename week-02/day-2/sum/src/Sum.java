public class Sum {
    public static void main(String[] args) {
        int a = 10;
        System.out.print(sum(a));
    }

    private static int sum(int input) {
        int sumResult = 0;
        for (int i = 0; i < input+1; i++){
            sumResult += i;
        }
        return sumResult;
    }
}
