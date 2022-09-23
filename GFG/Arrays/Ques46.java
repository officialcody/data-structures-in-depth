package GFG.Arrays;

// Plus One
import java.util.*;

class Ques46 {
    public static ArrayList<Integer> increment(ArrayList<Integer> arr , int N) {
        for(int i=N-1;i>=0;i--){
            if(arr.get(i) < 9){
                arr.set(i, arr.get(i)+1);
                return arr;
            } else {
                arr.set(i, 0);
            }
        }
        arr.add(0);
        arr.set(0, 1);
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int num = scan.nextInt();
            arr.add(num);
        }

        ArrayList<Integer> answer = increment(arr, n);
        for(int i : answer) {
            System.out.print(i + " ");
        }
        scan.close();
    }
}