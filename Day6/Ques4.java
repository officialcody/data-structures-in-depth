package Day6;

// Convert 0's to 5's in a number

import java.util.*;

public class Ques4 {
    public static int convertfive(int num) {
        int number = 0;
        int pos = 0;
        while(num > 0){
            int lastDigit = num%10;
            if(lastDigit == 0){
                number = number + (int) Math.pow(10, pos) * 5;
            } else {
                number = number + (int) (Math.pow(10, pos) * lastDigit);
            }
            num = num/10;
            pos++;
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int answer = convertfive(n);
        System.out.println("Converted Number is: " + answer);
        scan.close();
    }
}
