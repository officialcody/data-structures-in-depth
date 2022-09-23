package GFG.Strings;

// Check String
// Given a string, check if all its characters are same or not.
import java.util.*;

public class Ques15 {
    public static boolean check1(String s) {
        HashSet<Character> hs = new HashSet<Character>();
        for(int i=0;i<s.length();i++){
            hs.add(s.charAt(i));
        }
        return hs.size() == 1 ? true : false;
    }

    public static boolean check2(String s){
        for(int i=1;i<s.length();i++){
            if(s.charAt(0)!=s.charAt(i)){
              return false;  
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        if(check1(str) && check2(str)){
            System.out.println("All characters are same");
        } else {
            System.out.println("All characters are not same");
        }
        scan.close();
    }
}
