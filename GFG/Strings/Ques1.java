package GFG.Strings;

// Check Binary
import java.util.*;

public class Ques1 {
    public static boolean isBinary(String str) {
	    for(int i=0;i<str.length();i++){
	        if(str.charAt(i) != '0' && str.charAt(i) != '1'){
	            return false;
	        }
	    }
	    return true;
	}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        boolean isBinaryString = isBinary(str);
        if(isBinaryString){
            System.out.println("It is a binary string");
        } else {
            System.out.println("It is not a binary string");
        }
        scan.close();
    }
}
