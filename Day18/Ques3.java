package Day18;

import java.util.Scanner;

// Print even numbers from 0 to N
public class Ques3 {
    public static void printEvenNumbers(int number){
        for(int i=0;i<=number;i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        printEvenNumbers(number);
        scan.close();
    }
}
