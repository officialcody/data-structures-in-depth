package Day2;

// Smaller and larger than given number in array

import java.util.Scanner;

public class Ques7 {
    public static int[] getMoreAndLess(int[] arr, int n, int x) {
        int lte = 0;
        int gte = 0;
        for(int i=0;i<n;i++){
            if(arr[i] >= x){
                gte+=1;
            }
            if(arr[i] <= x){
                lte+=1;
            }
        }
        return new int[]{lte, gte};
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[1000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int x = scan.nextInt();
        int ans[] = getMoreAndLess(arr, n, x);
        System.out.println("Number of elements smaller than " + x + " are: " + ans[0]);
        System.out.println("Number of elements larger than " + x + " are: " + ans[1]);
        scan.close();
    }
}
