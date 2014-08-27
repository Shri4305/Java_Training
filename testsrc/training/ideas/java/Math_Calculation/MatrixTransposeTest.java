package training.ideas.java.Math_Calculation;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnsrb on 8/25/2014.
 */
public class MatrixTransposeTest {
    @Test
      public void given_2by2_matrix_transpose_it(){
        int [] [] input = {{1,2,3},{5,6,9}};
        int [] [] output={{1,5},{2,6},{3,9}};

        Assert.assertArrayEquals(output, MatrixTranspose.transpose(input));
    }

    @Test
    public void given_3by3_matrix_transpose_it(){
        int [] [] input = {{1,2,3},{4,5,6},{7,8,9}};
        int [] [] output={{1,4,7},{2,5,8},{3,6,9}};

        Assert.assertArrayEquals(output, MatrixTranspose.transpose(input));
    }

    @Test
    public void given_3by2_matrix_transpose_it(){
        int [] [] input = {{1,2,3},{4,5,6},};
        int [] [] output={{1,4},{2,5},{3,6}};

        Assert.assertArrayEquals(output, MatrixTranspose.transpose(input));
    }
    @Test
    public void given_3by2_matrix_allNegative_transpose_it(){
        int [] [] input = {{-1,-2,-3},{-4,-5,-6},};
        int [] [] output={{-1,-4},{-2,-5},{-3,-6}};

        Assert.assertArrayEquals(output, MatrixTranspose.transpose(input));
    }

    @Test
    public void given_3by2_matrix_NegativePositive_transpose_it(){
        int [] [] input = {{-1,2,3},{-4,5,-6},};
        int [] [] output={{-1,-4},{2,5},{3,-6}};

        Assert.assertArrayEquals(output, MatrixTranspose.transpose(input));
    }
}
