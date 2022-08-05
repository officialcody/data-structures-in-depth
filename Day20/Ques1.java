package Day20;

// Total distance travelled in an array
import java.util.*;

class Ques1 {
    public static long distance(int[] arr, int n) {
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for(int i=0;i<n;i++){
            map.put(arr[i],i);
        }
        long totalDistance=0;
        for(int i=1;i<n;i++){
            totalDistance = totalDistance + (long)(Math.abs(map.get(i+1) - map.get(i)));
        }
        return totalDistance;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[10000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        long totalDistance = distance(arr, n);
        System.out.println("Total distance travelled is: " + totalDistance);
        scan.close();
    }
}