package Day13;

// Find the fine
import java.util.*;

public class Ques8 {
    public static long totalFine( long n, long date, long car[], long fine[]) {
        long totalFine = 0;
        if(date%2==0){
            for(int i=0;i<(int)n;i++){
                if(car[i]%2!=0){
                    totalFine += fine[i];
                }
            }
        } else {
            for(int i=0;i<(int)n;i++){
                if(car[i]%2==0){
                    totalFine += fine[i];
                }
            }
        }
        return totalFine;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long date = scan.nextLong();
        long [] cars = new long[10000000];
        for(int i=0;i<n;i++){
            cars[i] = scan.nextInt();
        }
        long [] fine = new long[10000000];
        for(int i=0;i<n;i++){
            fine[i] = scan.nextInt();
        }
        long totalFine = totalFine(n, date, cars, fine);
        System.out.println("Total fine is: " + totalFine);
        scan.close();
    }
}
