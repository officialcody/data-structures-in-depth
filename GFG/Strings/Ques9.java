package GFG.Strings;

// Upper Case Conversion
import java.util.*;

public class Ques9 {
    public static String transform(String s) {
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(s.charAt(0)));
        for(int i=1;i<s.length();i++){
            if(i < s.length()-1 && s.charAt(i) == ' '){
                sb.append(s.charAt(i));
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String answer = transform(str);
        System.out.println("After converting first letter to uppercase");
        System.out.println(answer);
        scan.close();
    }
}
