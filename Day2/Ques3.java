package Day2;

// Display longest name
import java.util.*;

public class Ques3 {

    static String  longest(String names[], int n) {
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
        String [] arr = new String[100];
        for(int i=0;i<n;i++){
            arr[i] = scan.next();
        }
        System.out.println("Longest String in the array is: " + longest(arr, n));
        scan.close();
    }
    
}
