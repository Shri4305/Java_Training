package training.ideas.java.Math_Calculation;

/**
 * Created by idnsrb on 8/21/2014.
 */
public class MatrixAdditionArray {
    public static Object[] matrixAdd(int[][] inputArray1, int[][] inputArray2) {
        int [][] result=new int[inputArray1.length][inputArray1[0].length];
        for (int row = 0; row <inputArray1.length ; row++) {
            for (int column = 0; column <inputArray1[0].length ; column++) {
                result[row] [column]=inputArray1[row][column]+inputArray2[row][column];

            }

        }

        return  result;
    }
}
