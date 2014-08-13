package training.ideas.java.decisions;

import org.junit.Test;
import org.junit.Assert;
//import training.ideas.java.FpLosCal;

/**
 * Created by idnsrb on 7/24/2014.
 */
public class FPLOSCalculatorTest {
    @Test

    public void FPLosLowerRate(){
        double rate=90;
        double[] LRV={100,150,150,125,120,100,100};

        Assert.assertEquals("Pattern does not match", "NNNNNNN", FpLoscal.fpLossPattern(rate, LRV));
    }

    @Test

    public void FPLosRate(){
        double rate=150;
        double[] LRV={100,150,150,125,120,100,100};

        Assert.assertEquals("Pattern does not match 1", "YYYYYYY", FpLoscal.fpLossPattern(rate, LRV));
    }
    @Test

    public void FPLosRate1(){
        double rate=100;
        double[] LRV={100,0,150,125,120,100,100};

        Assert.assertEquals("Pattern does not match 2", "YYYYYYY", FpLoscal.fpLossPattern(rate, LRV));
        }

    @Test

    public void FPLosMoreThanTwoRate1(){
        double []  rate={90,100};
        double[] LRV={100,0,150,125,120,100,100};
        String[] PatternArray={"NYYNNNN","YYYYYYY"};
        Assert.assertArrayEquals("Pattern does not match 3", PatternArray, FpLoscal.fpLossPattern(rate, LRV));

    }



}
