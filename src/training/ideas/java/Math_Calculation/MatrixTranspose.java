package training.ideas.java.Math_Calculation;

/**
 * Created by idnsrb on 8/25/2014.
 */
public class MatrixTranspose {
    public static Object[] transpose(int[][] input) {
        int numberOfRows=input.length;
        int numberOfColumns=input[0].length;
        int [][] outputMatrix=new int [numberOfColumns][numberOfRows];
        for (int row = 0; row < numberOfRows; row++) {
            for (int columns = 0; columns < numberOfColumns; columns++) {
                outputMatrix[columns][row]=input[row][columns];
            }
        }
        return outputMatrix;
    }
}
