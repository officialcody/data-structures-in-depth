package Day6;

import java.util.*;

public class Ques8 {
    public static boolean checkTriplet(int[] arr, int n) {
        Arrays.sort(arr);
        for ( int i=0;i<n;i++ ){
            for ( int j=i+1;j<n;j++ ){
                for ( int k=j+1;k<n;k++ ){
                    if ( (arr[i]*arr[i])+(arr[j]*arr[j])==(arr[k]*arr[k]))
                                return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        if(checkTriplet(arr, n)){
            System.out.println("It's a Pythagorian Triplet");
        } else {
            System.out.println("It's not a Pythagorian Triplet");
        }
        scan.close();
    }
}
