package GFG.Strings;

// Triangle shrinking downwards
import java.util.Scanner;

public class Ques23 {
    public static String triDownwards(String S){
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<S.length();i++){
            for(int j=0;j<i;j++){
                sb.append(".");
            }
            for(int j=i;j<S.length();j++){
                sb.append(S.charAt(j));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String triangle = triDownwards(str);
        System.out.println(triangle);
        scan.close();
    }
}
