package training.ideas.java.Series;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnsrb on 8/11/2014.
 */
public class FibonacciNumberRecTest {

    @Test
    public void FibonacciSeries_5Numbers(){
        int number=4;
        int expectedNumber[]={0,1,1,2};
        Assert.assertArrayEquals(expectedNumber, FibonacciNumberRec.fibonacciNumberSeries(number));

    }
}
