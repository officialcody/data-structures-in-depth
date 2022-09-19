package ApnaCollegePracticeQuestions;

public class StairCaseSearch {
    public static boolean stairCaseSearch(int [][] matrix, int key){
        int row = 0;
        int column = matrix[0].length-1;
        // taking top left corner cell as start
        while(row < matrix.length && column >=0){
            if(matrix[row][column] == key){
                System.out.println("Found key at (" + row + ", " + column + ")");
                return true;
            } else if(key < matrix[row][column]){
                column--;
            } else {
                row++;
            }
        }
        // taking bottom right corner cell as start
        // int row = matrix.length-1;
        // int column = 0;
        // while(row >=0 && column < matrix[0].length){
        //     if(matrix[row][column] == key){
        //         System.out.println("Found key at (" + row + ", " + column + ")");
        //         return true;
        //     } else if(key < matrix[row][column]){
        //         row--;
        //     } else {
        //         column++;
        //     }
        // }
        System.out.println("Key not found");
        return false;
    }
}
