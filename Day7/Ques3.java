package Day7;

// Product of Max in first and Min in second array
import java.util.Scanner;

public class Ques3 {
    public static long find_multiplication (int arr[], int brr[], int n, int m) {
        int maxInFirstArray = Integer.MIN_VALUE;
        for(int number : arr){
            if(number > maxInFirstArray){
                maxInFirstArray = number;
            }
        }
        int minInSecondArray = Integer.MAX_VALUE;
        for(int number : brr){
            if(number < minInSecondArray){
                minInSecondArray = number;
            }
        }
        return maxInFirstArray * minInSecondArray;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[1000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int m = scan.nextInt();
        int [] brr = new int[1000000];
        for(int i=0;i<m;i++){
            brr[i] = scan.nextInt();
        }
        long productOfMaxInFirstAndMinInSecondArray = find_multiplication(arr, brr, n, m);
        System.out.println("Product of Max in first and Min in second array is: " + productOfMaxInFirstAndMinInSecondArray);
        scan.close();
    }
}
