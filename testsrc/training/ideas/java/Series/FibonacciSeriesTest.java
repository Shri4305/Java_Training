package training.ideas.java.Series;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnsrb on 8/7/2014.
 */
public class FibonacciSeriesTest {

    @Test
      public void FibonacciSeries_5Numbers(){
        int num=4;
        int expectedNumber[]={0,1,1,2};
        Assert.assertArrayEquals(expectedNumber, FibonacciNumber.fibonacciCalculationRecursion(num));

    }
}
