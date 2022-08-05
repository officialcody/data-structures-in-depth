package Day20;

// Count number of elements between two given elements in array
import java.util.*;

public class Ques5 {
    public static int getCount(int arr[], int n, int num1, int num2) { 
        int indexOfNum1 = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == num1){
                indexOfNum1 = i;
                break;
            }
        }
        int indexOfNum2 = 0;
        for(int i=n-1;i>=0;i--){
            if(arr[i] == num2){
                indexOfNum2 = i;
                break;
            }
        }
        return (indexOfNum2 == indexOfNum1)? 0 : indexOfNum2 - indexOfNum1 - 1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[10000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int count = getCount(arr, n, num1, num2);
        System.out.println("Number of elements in array between leftmost " + num1 + " and rightmost " + num2 + " is: " + count);
        scan.close();
    }
}
