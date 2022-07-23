package Day7;

import java.util.Scanner;

public class Ques5 {
    public static int multiplyLeftAndRightArraySums(int arr[], int n) {
        int leftArraySum = 0;
        int rightArraySum = 0;
        for(int i=0;i<n;i++){
            if(i < n/2){
                leftArraySum += arr[i];
            } else {
                rightArraySum += arr[i];
            }
        }
        return leftArraySum * rightArraySum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int multiplyLeftAndRightArraySums = multiplyLeftAndRightArraySums(arr, n);
        System.out.println("Product of left and right array sum's is: " + multiplyLeftAndRightArraySums);
        scan.close();
    }
}
