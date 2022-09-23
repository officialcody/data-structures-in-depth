package GFG.Strings;

// Display longest name
import java.util.*;

public class Ques2 {
    public static String longestName(String names[], int n) {
        String largestString = "";
        for(int i=0;i<n;i++){
            if(names[i].length() > largestString.length()){
                largestString = names[i];
            }
        }
        return largestString;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String [] names = new String[n];
        for(int i=0;i<n;i++){
            names[i] = scan.next();
        }
        String longesName = longestName(names, n);
        System.out.println("Longest name is: " + longesName);
        scan.close();
    }
}
