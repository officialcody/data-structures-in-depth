package ApnaCollegePracticeQuestions;

public class DiagonalSum {
    public static int diagonalSum(int [][] matrix){
        int n = matrix.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            // primary diagonal
            sum += matrix[i][i];
            // secondary diagonal
            if(i != n - i - 1){
                sum += matrix[i][n-i-1];
            }
        }
        return sum;
    }
}
