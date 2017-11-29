public class SimpleReplace {
    public static void main(String... args){
        String example = "In a dishwasher far far away";

        String replaced = example.replace("dishwasher", "galaxy");

        //StringBuilder replaced = new StringBuilder(example).replace(5,15, "galaxy");

        System.out.println(replaced);
    }
}
