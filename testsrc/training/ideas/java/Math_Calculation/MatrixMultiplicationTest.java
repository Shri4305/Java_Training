package training.ideas.java.Math_Calculation;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnsrb on 8/25/2014.
 */
public class MatrixMultiplicationTest {

    @Test

    public void given_2by2_Matrix(){

        int [][] matrixOne={{1,2},{3,4}};
        int [][] matrixTwo={{5,6},{7,8}};
        int[][] resultMatrix={{19,22},{43,50}};
        Assert.assertArrayEquals(resultMatrix, MatrixMultiplication.multiplication(matrixOne, matrixTwo));
    }

    @Test

    public void given_3by3_2by3_Matrix(){

        int [][] matrixOne={{1,2,3},{2,3,4}};
        int [][] matrixTwo={{4,7},{5,8},{6,9}};
        int[][] resultMatrix={{32,50},{47,74}};
        Assert.assertArrayEquals(resultMatrix, MatrixMultiplication.multiplication(matrixOne, matrixTwo));
    }
}
