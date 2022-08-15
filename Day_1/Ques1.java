package Day_1;

import java.util.*;

class Ques1 {

    public static int factorial(int number){
        if(number == 0) return 1;
        if(number == 2 || number == 1) return number;
        int factorial=2;
        for(int i=number;i>=3;i--){
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int factorial = factorial(number);
        scan.close();
    }
}