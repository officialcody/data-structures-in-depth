package Day2;

// PERFECT ARRAYS
import java.util.Scanner;

public class Ques8 {
    public static boolean IsPerfect(int a[], int n)
    {
        for(int i=0;i<n/2;i++){
            if(a[i] != a[n-i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        if(IsPerfect(arr, n)){
            System.out.println("PERFECT");
        } else {
            System.out.println("NOT PERFECT");
        }
        scan.close();
    }
}
