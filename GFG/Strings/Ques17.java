package GFG.Strings;

// Java Substring
import java.util.Scanner;

public class Ques17 {
    public static String javaSub(String S, int L, int R) {
        StringBuilder sb = new StringBuilder("");
        for(int i=L;i<=R;i++){
            sb.append(S.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int L = scan.nextInt();
        int R = scan.nextInt();
        String javaSubString = javaSub(str, L, R);
        System.out.println("Substring is: " + javaSubString);
        scan.close();
    }
}
