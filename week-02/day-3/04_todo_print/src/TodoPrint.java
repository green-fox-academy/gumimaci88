public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";

        String todoTextA = "My todo:\n" + todoText;
        String todoTextB = todoTextA + " - Download games\n";
        String todoTextFinal = todoTextB + "     - Diablo";

        System.out.println(todoTextFinal);
    }
}
