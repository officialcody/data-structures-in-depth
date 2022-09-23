package GFG.Arrays;

// King's War
import java.util.*;

public class Ques30 {
    public static long SoldierRequired(long arr[], long n) {
        Arrays.sort(arr);
        long strongest = arr[(int)n-1];
        long weakest = arr[0];
        long numberOfSoildersRequired = 0;
        if(n <= 2){
            return 0;
        } else {
            for(long enemy : arr){
                if(enemy < strongest && enemy > weakest){
                    numberOfSoildersRequired++;
                }
            }
        }
        return numberOfSoildersRequired;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long [] arr = new long[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        long numberOfSoildersRequired = SoldierRequired(arr, n);
        System.out.println("Number of soilders required by the King: " + numberOfSoildersRequired);
        scan.close();
    }
}
