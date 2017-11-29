public class TakesLonger {
    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        //int i = quote.indexOf("you");
        //quote = quote.substring(0,i) + "always takes longer than " + quote.substring(i,quote.length());

        StringBuilder result;
        result = new StringBuilder(quote).insert(21, "always takes longer than ");

        System.out.print(result);

    }
}
