public class Factorio {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(factorio(a));
    }

    public static int factorio(int input) {
        int factResult = 1;
        for (int i = 1; i < input+1; i++){
            factResult *= i;
        }
        return factResult;
    }
}
