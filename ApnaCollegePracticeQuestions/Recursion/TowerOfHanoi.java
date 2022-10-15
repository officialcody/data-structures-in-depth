package ApnaCollegePracticeQuestions.Recursion;

public class TowerOfHanoi {
    public static int towerOfHanoi(int n, String source, String helper, String destination) {
        if(n == 1) {
            System.out.println("transfer disk " + n + " from " + source + " to " + destination);
            return 1;
        }
        int steps = towerOfHanoi(n-1, source, destination, helper);
        System.out.println("transfer disk " + n + " from " + source + " to " + destination);
        return steps + 1 + towerOfHanoi(n-1, helper, source, destination);
    }

    public static void main(String[] args) {
        int n = 5;
        int count = towerOfHanoi(n, "S", "H", "D");
        System.out.println(count);
    }
}
