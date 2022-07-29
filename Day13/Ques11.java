package Day13;

// Positive and negative elements
import java.util.*;

public class Ques11 {
    public static ArrayList<Long> arranged(long a[], int n) {
        ArrayList<Long> positiveNumbers = new ArrayList<Long>();
        ArrayList<Long> negativeNumbers = new ArrayList<Long>();
        for(int i=0;i<n;i++){
            if(a[i] < 0){
                negativeNumbers.add(a[i]);
            } else {
                positiveNumbers.add(a[i]);
            }
        }
        ArrayList<Long> result = new ArrayList<Long>();
        while(!positiveNumbers.isEmpty() || !negativeNumbers.isEmpty()){
            result.add(positiveNumbers.remove(0));
            result.add(negativeNumbers.remove(0));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long [] a = new long[10000000];
        for(int i=0;i<n;i++){
            a[i] = scan.nextInt();
        }
        ArrayList<Long> answer = arranged(a, n);
        System.out.println("Arranged array");
        for(long i : answer){
            System.out.print(i + " ");
        }
        scan.close();
    }
}
