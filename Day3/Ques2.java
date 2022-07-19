package Day3;

// Find Triplets with zero sum
import java.util.*;

public class Ques2 {
    public static boolean findTriplets(int arr[] , int n)
    {
        if(n<3) return false;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                if(arr[i] + arr[j] + arr[k] == 0){
                    return true;
                } else if(arr[i]+arr[j]+arr[k] < 0){
                    j++;
                } else {
                    k--;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        if(findTriplets(arr, n)){
            System.out.println("Triplet exists");
        } else {
            System.out.println("Triplet doesnot exists");
        }
        scan.close();
    }
}
