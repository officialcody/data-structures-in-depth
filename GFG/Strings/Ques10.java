package GFG.Strings;

// Convert a list of characters into a String
import java.util.*;

public class Ques10 {
    public static String chartostr(char arr[], int N){
        StringBuilder sb = new StringBuilder("");
        for(char ch : arr){
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char [] arr = new char[n];
        String answer = chartostr(arr, n);
        System.out.println("String is: " + answer);
        scan.close();
    }
}
