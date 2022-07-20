package Day4;

import java.util.*;

public class Ques3 {
    public static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        for(int i=0;i<n;i+=k){
           int low=i;
           if(low>=(n-1))
               break;
           int high=i-1+k;
           if(high>(n-1))
               high=n-1;
           while(low<high)
               {
                   int temp = arr.get(low);
                   arr.set(low, arr.get(high));
                   arr.set(high, temp);
                   low++;
                   high--;
               }
       }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>(10000000);
        for(int i=0;i<n;i++){
            arr.add(scan.nextInt());
        }
        int k = scan.nextInt();
        System.out.println("Array before reverse");
        for(int i : arr){
            System.out.print(i + "");
        }
        reverseInGroups(arr, n, k);
        System.out.println("Array after reverse");
        for(int i : arr){
            System.out.print(i + "");
        }
        scan.close();
    }
}
