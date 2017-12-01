import java.util.*;

public class FindPartofInteger {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 11, 87, 34, 52, 61, 23, 25, 86, 76));

            System.out.println("Please give a number between 1-9: ");
            String number = input.next();

            System.out.print(findInt(list,number));

        }
        private static ArrayList<Integer> findInt(ArrayList<Integer> inputList, String num) {
            ArrayList<String> funcInput = new ArrayList<>();
            ArrayList<Integer> funcOutput = new ArrayList<>();

            for(int i = 0; i < inputList.size(); i ++) {
                String temp1 = Integer.toString(inputList.get(i));
                funcInput.add(temp1);
            }

            for( int i = 0; i < funcInput.size(); i ++) {
                String temp2 = funcInput.get(i);
                for(int j = 0; j < temp2.length(); j ++) {
                    if(temp2.substring(j, j + num.length()).equals(num)) {
                        funcOutput.add(i);
                        break;
                    }
                }
            }
            return funcOutput;
       }
}