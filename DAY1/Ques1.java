package DAY1;

// Face off Tournament
import java.util.*;

public class Ques1 {
    public static String winner(int x, int m, int n, long arr[]) {
        int countRam = 0;
        int countRohan = 0;
        String ans = "";
        for(int i=0;i<x;i++){
            if(arr[i]%m==0){
                countRam++;
            }else if(arr[i]%n==0){
                countRohan++;
            }
        }
        if(countRam > countRohan){
            ans = "Ram";
        } else if(countRohan > countRam){
            ans = "Rohan";
        } else {
            ans = "Both";
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        long arr[] = new long[1000000];
        for(int i=0;i<x;i++){
            arr[i] = scan.nextLong();
        }
        int m = scan.nextInt();
        int n = scan.nextInt();
        String winner = winner(x, m, n, arr);
        System.out.println("Winner is: " + winner);
        scan.close();
    }
}
