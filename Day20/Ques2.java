package Day20;

// Digits in a set
import java.util.*;

public class Ques2 {
    public static int countNumbers(int n) {
        int count = 0;
        Set<Integer> s = Set.of(1,2,3,4,5);
        for(int i=1;i<=n;i++){
            if(check(i, s)){
                count++;
            }
        }
        return count;
    }
    
    public static boolean check(int i, Set<Integer> s){
        while(i != 0){
            int number = i%10;
            if(!s.contains(number)) return false;
            i = i/10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int numbers = countNumbers(n);
        System.out.println("Numbers that contain 1,2,3,4,5 in them up to " + n + " are: " + numbers);
        scan.close();
    }
}
