package GFG.Strings;

// Check if strings are rotations of each other or not
import java.util.*;

public class Ques27 {
    public static boolean areRotations(String s1, String s2 ) {
        return (s1.length() == s2.length()) && ((s1 + s1).contains(s2));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();
        if(areRotations(s1, s2)){
            System.out.println("They are rotated strings");
        } else {
            System.out.println("They are not rotated");
        }
        scan.close();
    }
}
