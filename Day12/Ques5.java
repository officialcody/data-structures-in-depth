package Day12;

// Check Arithmetic Progression (AP)
import  java.util.*;

public class Ques5 {
    public static boolean checkIsAP(int arr[] ,int n) {
        if(n == 1) return true;
        Arrays.sort(arr);
        int d = arr[1]-arr[0];
        for(int i=2;i<n;i++){
            if(arr[i] - arr[i-1] != d){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[10000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        boolean answer = checkIsAP(arr, n);
        if(answer){
            System.out.println("AP can be formed by these elements");
        } else {
            System.out.println("AP can not be formed by these elements");
        }
        scan.close();
    }
}
