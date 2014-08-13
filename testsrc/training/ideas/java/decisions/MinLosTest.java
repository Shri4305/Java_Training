package training.ideas.java.decisions;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnsrb on 7/28/2014.
 */
public class MinLosTest {
    @Test
    public void IF_FPlos_Pattern_Is_YNNNNNN_Monis_One(){
        String FPLos="YNNNNNN";
        Assert.assertEquals("min Loss does not match ", 1, MinLos.minLosPattern(FPLos));
    }

    @Test
    public void IF_FPlos_Pattern_Is_NNNNNNN_Monis_zero(){
        String FPLos="NNNNNNN";
        Assert.assertEquals("min Loss does not match ", 0, MinLos.minLosPattern(FPLos));
    }
    @Test
    public void IF_FPlos_Pattern_Is_NNNNNNY_Monis_Seven(){
        String FPLos="NNNNNNY";
        Assert.assertEquals("min Loss does not match ", 7, MinLos.minLosPattern(FPLos));
    }
}
