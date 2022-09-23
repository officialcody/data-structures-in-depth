package GFG.Strings;

// Lower case to upper case
import java.util.*;

public class Ques12 {
    public static String to_upper(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String answer = to_upper(str);
        System.out.println("After Converting lowercase to uppercase");
        System.out.println(answer);
        scan.close();
    }
}
