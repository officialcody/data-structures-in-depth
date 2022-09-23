package GFG.Arrays;

// License Key Formatting
import java.util.*;

public class Ques49 {
    static String ReFormatString(String S, int K){
        StringBuilder sb = new StringBuilder();
		
        S = S.toUpperCase();
        S = S.replaceAll("-","");
        
        int count = 0;
        for(int i=S.length()-1; i>=0; i--)
        {
            if(count == K)
            {
                sb.append('-');
                count = 0;
            }
            sb.append(S.charAt(i));
            count++;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int K = scan.nextInt();
        String reformattedString = ReFormatString(str, K);
        System.out.println("After reformatting: " + reformattedString);
        scan.close();
    }
}
