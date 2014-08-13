package training.ideas.java.Math_Calculation;

import junit.framework.Assert;
import org.junit.Test;
import training.ideas.java.Math_Calculation.Addition;

/**
 * Created by idnsrb on 7/22/2014.
 */
public class AdditionTest {

    public void addIntegerInteger ()
    {
        Assert.assertEquals("Addition integer pulse integer does not match", 4+3+3+2, Addition.add(4, 3, 3, 2),0);
    }

    public void addDoubleDouble ()
    {
        Assert.assertEquals("Addition double pulse double not match", 2.4+2.0+3.3, Addition.add(2.4, 2.0,3.3),0);
     }

     public void addDoubleInteger  ()
     {
        Assert.assertEquals("Addition double pulse integer does not match", 7.1, Addition.add(4.1, 3));
     }

    @Test
    public void addDoubleIntegerV()
    {
        Assert.assertEquals("Addition variable arguments does not match", 4.1+3+3+2, Addition.add(4.1,3,3,2));

     }

    public void addMinusMinus  ()
    {
        Assert.assertEquals("Addition double pulse double not match", -5, Addition.add(-4,-1),0);
    }


    @Test


    public void addIntegerArray()
    {
        double [] array={1,2,10};
        Assert.assertEquals("Addition does not match in double array", 13.0, Addition.add(array));
    }



}



