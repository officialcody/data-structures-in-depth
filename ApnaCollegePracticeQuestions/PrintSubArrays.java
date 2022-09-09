package ApnaCollegePracticeQuestions;

// Print All Subarrays of an array
import java.util.Scanner;

public class PrintSubArrays {

    public static void printSubArrays(int [] arr, int n){
        int minimumSubArraySum = Integer.MAX_VALUE;
        int maximumSubArraySum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                }
                System.out.println("Sum -> " + sum);
                System.out.println();
                if(sum < minimumSubArraySum){
                    minimumSubArraySum = sum;
                }
                if(sum > maximumSubArraySum){
                    maximumSubArraySum = sum;
                }
            }
            System.out.println();
        }

        System.out.println("Maximum SubArray Sum is: " + maximumSubArraySum);
        System.out.println("Minimum SubArray Sum is: " + minimumSubArraySum);
    }
    public static void main(String[] args) {
        int [] arr= new int[]{2,4,6,8,10};
        printSubArrays(arr, 5);
    }
}
