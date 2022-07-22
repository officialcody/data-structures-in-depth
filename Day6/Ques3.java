package Day6;

// Third Largest element in an array

import java.util.*;

public class Ques3 {
    public static int thirdLargest(int a[], int n)
    {
        Arrays.sort(a);
        if(n<3) return -1;
        return a[n-3];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int thirdLargestElement = thirdLargest(arr, n);
        if(thirdLargestElement != -1){
            System.out.println("Third largest element is: " + thirdLargestElement);
        } else {
            System.out.println("No third largest element");
        }
        scan.close();
    }
}
