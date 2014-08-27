package training.ideas.java.Math_Calculation;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnsrb on 8/21/2014.
 */
public class MatrixAdditionArrayTest {
    @Test
    public void given_2_matrix_of_2_add_it() {
        int[][] inputArray1 = {{1, 2}, {3, 4}};
        int[][] inputArray2 = {{5, 6}, {7, 8}};
        int[][] output = {{6, 8}, {10, 12}};
        Assert.assertArrayEquals(output, MatrixAdditionArray.matrixAdd(inputArray1, inputArray2));
    }

    @Test
    public void given_3_matrix_by_2_add_it() {
        int[][] inputArray1 = {{1, 2, 3}, {3, 4, 2}};
        int[][] inputArray2 = {{7, 8, 6}, {9, 1, 1}};
        int[][] output =      {{8, 10, 9}, {12, 5, 3}};
        Assert.assertArrayEquals(output, MatrixAdditionArray.matrixAdd(inputArray1, inputArray2));
    }


}
