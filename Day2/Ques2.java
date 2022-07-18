package Day2;

// Count of smaller elements

import java.util.Scanner;

public class Ques2 {

    public static long countOfElements(long arr[], long n, long x)
    {
        long count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>x){
                break;
            }
            count+=1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();
        long [] arr = new long[100000];
        for(int i=0;i<N;i++){
            arr[i] = scan.nextLong();
        }
        long X = scan.nextLong();
        long ans = countOfElements(arr, N, X);
        System.out.println("Number of elements in array less than or equal to " + N + " are: " + ans);
        scan.close();
    }
}