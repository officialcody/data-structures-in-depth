package Day17;

import java.util.*;

// Area of circle
public class Ques1 {
    public static double areaOfCircle(double radius){
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double radius = scan.nextDouble();
        double areaOfCircle = areaOfCircle(radius);
        System.out.println("Area of circle is: " + areaOfCircle);
        scan.close();
    }
}
