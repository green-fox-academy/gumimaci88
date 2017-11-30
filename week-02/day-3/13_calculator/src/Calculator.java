import java.util.*;

public class Calculator {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please type in the expression starting with the operation, followed by two operands (e.g.: + 4 6): ");
        String expression = input.nextLine();
        System.out.println(calculator(ArraytoList(expression)));

    }

    public static ArrayList<String> ArraytoList (String input) {
        ArrayList<String> output = new ArrayList<String>();
        String operation = input.substring(0,1);
        output.add(operation);

        String number1 = input.substring(2,3);
        String number2 = input.substring(4,5);

        output.add(number1);
        output.add(number2);

        return output;
    }

    public static int calculator (ArrayList<String> input) {
        int operand1 = Integer.parseInt(input.get(1));
        int operand2 = Integer.parseInt(input.get(2));
        int result = 0;

        if (input.get(0).equals("+")) {
            result = operand1 + operand2;
        }

        if (input.get(0).equals("-")) {
            result = operand1 - operand2;
        }

        if (input.get(0).equals("*")) {
            result = operand1 * operand2;
        }

        if (input.get(0).equals("/")) {
            result = operand1 / operand2;
        }

        if (input.get(0).equals("%")) {
            result = operand1 % operand2;
        }

        return result;
    }
}