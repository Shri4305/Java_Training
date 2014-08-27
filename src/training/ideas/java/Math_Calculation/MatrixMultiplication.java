package training.ideas.java.Math_Calculation;

/**
 * Created by idnsrb on 8/25/2014.
 */
public class MatrixMultiplication {
    public static Object[] multiplication(int[][] matrixOne, int[][] matrixTwo) {
        int rowOfOne=matrixOne.length;
        int columnsOfTwo=matrixTwo[0].length;
        int rowOfSecond=matrixTwo.length;
        int [][] result=new int[rowOfOne][columnsOfTwo];
        for (int rowNumber = 0; rowNumber < rowOfOne; rowNumber++) {
            for (int columnsNumber = 0; columnsNumber < columnsOfTwo; columnsNumber++) {
                for (int i = 0; i < rowOfSecond; i++) {
                    result[rowNumber][columnsNumber]+=matrixOne[rowNumber][i]*matrixTwo[i][columnsNumber];
                }
            }
        }

        return result;
    }
}
