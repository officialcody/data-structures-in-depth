package Day23;

// Maximum Perimeter of Triangle from array
import java.util.*;

public class Ques1 {
    public static int maxPerimeter (int arr[], int n) {
        Arrays.sort(arr);
        int per = -1;
        int i = n-3;
        while(i >= 0){
            if(arr[i] + arr[i+1] > arr[i+2]){
                per = arr[i] + arr[i+1] + arr[i+2];
                break;
            }
            i--;
        }
        return per;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[10000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int answer = maxPerimeter(arr, n);
        System.out.println("Total Subsets: " + answer);
        scan.close();
    }
}
