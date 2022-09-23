package GFG.Strings;

// Implement strstr
import java.util.*;

public class Ques26 {
    public static int strstr(String s, String x) {
        if(s.contains(x)){
            return s.indexOf(x);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String x = scan.next();
        int answer = strstr(s, x);
        if(answer == -1){
            System.out.println("Not found");
        } else {
            System.out.println("Found at: " + answer);
        }
        scan.close();
    }
}
