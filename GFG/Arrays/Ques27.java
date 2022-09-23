package GFG.Arrays;

// Learning Output
import java.util.*;

public class Ques27 {
    public static void learningOutput(long arr[], long n) {
        long positiveNumbers = 0;
        long negativeNumbers = 0;
        long zeros = 0;
        
        for(long a : arr){
            if(a < 0){
                negativeNumbers++;
            } else if(a > 0){
                positiveNumbers++;
            }
            else {
                zeros++;
            }
        }
        String a,b,c;
        
        a = (new java.math.BigDecimal(String.format("%.5f",(float)n/positiveNumbers)).stripTrailingZeros().toPlainString()).toString();
        b = (new java.math.BigDecimal(String.format("%.5f",(float)n/negativeNumbers)).stripTrailingZeros().toPlainString()).toString();
        c = (new java.math.BigDecimal(String.format("%.5f",(float)n/zeros)).stripTrailingZeros().toPlainString()).toString();
        
        StringBuilder sa = new StringBuilder(a);
        StringBuilder sb = new StringBuilder(b);
        StringBuilder sc = new StringBuilder(c);
        
        if(sa.indexOf(".") != -1 && sa.length() >= 8){
            sa.delete(7,sa.length());
        }
        if(sb.indexOf(".") != -1 && sb.length() >= 8){
            sb.delete(7,sb.length());
        }
        if(sc.indexOf(".") != -1 && sc.length() >= 8){
            sc.delete(7,sc.length());
        }
        
        // GFG.pos = sa.toString();
        System.out.println(sa.toString());
        // GFG.neg = sb.toString();
        System.out.println(sb.toString());
        // GFG.zero = sc.toString();
        System.out.println(sc.toString());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long [] arr = new long[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        learningOutput(arr, n);
        scan.close();
    }
}
