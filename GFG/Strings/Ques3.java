package GFG.Strings;

// Convert to lowercase
import java.util.*;

public class Ques3 {
    public static String toLower(String S) {
        return S.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String lowered = toLower(str);
        System.out.println("Lower case string: " + lowered);
        scan.close();
    }
}
