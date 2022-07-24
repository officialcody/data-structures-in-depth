package Day8;

// Play with an array
import java.util.*;

public class Ques9 {
    public static int[] formatArray(int[] a,int n){
	    for(int i=0;i<n-1;i+=2){
	        if(a[i] > a[i+1]){
	            int temp = a[i];
	            a[i] = a[i+1];
	            a[i+1] = temp;
	        }
	    }
	    return a;
	}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr [] = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int [] answer = formatArray(arr, n);
        System.out.println("Array after formatting");
        for(int i : answer){
            System.out.print(i + " ");
        }
        scan.close();
    }
}
