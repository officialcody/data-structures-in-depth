package Day18;

import java.util.Scanner;

// Greatest of 3 numbers
public class Ques2 {
    public static int greatestNumber(int a, int b, int c){
        if(a > b){
            if(a > c){
                return a;
            } else {
                return c;
            }
        } else {
            if(b > c){
                return b;
            } else {
                return c;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int greatest = greatestNumber(a, b, c);
        System.out.println("Greatest of " + a + " " + b + " b " + c + " c " + " is: " + greatest);
        scan.close();
    }
}
