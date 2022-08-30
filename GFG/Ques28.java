package GFG;

// Powers Game
import java.util.*;

public class Ques28 {
    public static long power(int a, int b){
        long prod=1;
        while(b>0)
        {
            prod*=a;
            b--;
        }
        return prod;
    }

    public static int[] getFreq(int x, int n) {
        int [] answer = new int[10];
        String numbers = "";
        for(int i=1;i<=n;i++){
            numbers += power(x, i);
        }
        char [] charArray = numbers.toString().toCharArray();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(char ch : charArray){
            map.put(Character.getNumericValue(ch), map.getOrDefault(Character.getNumericValue(ch), 0)+1);
        }
        for(int i=0;i<10;i++){
            answer[i] = map.getOrDefault(i, 0);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int [] answer = getFreq(x, n);
        System.out.println("Frequency of each element: ");
        for(int i : answer){
            System.out.print(i + " ");
        }
        scan.close();
    }
}
