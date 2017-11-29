import java.util.Arrays;
import java.util.ArrayList;

public class AppendLetter {
    public static void main(String... args){
        ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));

        for (int i = 0; i < far.size(); i++) {
            String a = far.get(i);
            a += "a";
            far.set(i, a);
        }

        System.out.println(far);
    }
}
