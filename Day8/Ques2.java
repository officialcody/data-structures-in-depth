package Day8;

// Minimum and Maximum difference
// Chocolate Distribution Problem
import java.util.*;

public class Ques2 {
    public static long findMinDiff (ArrayList<Integer> a, int n, int m) {
        Collections.sort(a);
        long min = Integer.MAX_VALUE;
       
        for(int i=0; i<n-m+1; i++){
            min = Math.min(min, a.get(i+m-1) - a.get(i));
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i =0;i<n;i++){
            a.add(scan.nextInt());
        }
        int m = scan.nextInt();
        long answer = findMinDiff(a, n, m);
        System.out.println("Minimum and Maximum difference is: " + answer);
        scan.close();
    }
}
