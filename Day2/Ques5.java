package Day2;

import java.util.Scanner;

// Find Index of first and last occurence of an element in array

public class Ques5 {
    static int[] findIndex(int a[], int N, int key) 
    { 
        int count = 0;
        int first = 0;
        int last = 0;
        
        for(int i=0;i<N;i++){
            if(a[i] == key && count == 0){
                first = i;
                last = i;
                count++;
            }else if(a[i]== key && count > 0){
                last = i;
            }
        }
        
        return count > 0 ? new int[]{first, last} : new int[]{-1,-1};
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[1000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        int [] ans = findIndex(arr, n, k);
        System.out.print("First occurence: " + ans[0]);
        System.out.print("Last occurence: " + ans[1]);
        scan.close();
    }
}
