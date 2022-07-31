package Day15;

// Jay's Apples

/***
 * QUES - One day Jay, on getting his first salary, decides to distribute apples among the poverty-stricken persons.
 * He gave each person 1kg of apples. People are coming in a queue and he makes sure that he gives every person 1 kg 
 * of apples only once. Every person is identified by a specific integer.
 * Given the length of the queue N followed by an array of N integers, denoting the persons in that queue, find the
 * minimum kilograms of apples Jay will have to distribute.
 */
import java.util.*;

public class Ques9 {
    public static int minimumApples(int arr[], int n) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<n;i++){
            hs.add(arr[i]);
        }
        return hs.size();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[10000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int minimumApples = minimumApples(arr, n);
        System.out.println("Minimum Apples " + minimumApples);
        scan.close();
    }
}
