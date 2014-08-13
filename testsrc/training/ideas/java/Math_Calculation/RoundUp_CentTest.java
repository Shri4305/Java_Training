package training.ideas.java.Math_Calculation;

import junit.framework.Assert;
import org.junit.Test;


/**
 * Created by idnsrb on 8/11/2014.
 */
public class RoundUp_CentTest {
    @Test
    public void round_up_5cent(){

        double numbers=3.03;
        double round_number=3.05;
        int centNumber=5;

        Assert.assertEquals("cent does not match", round_number, RoundUp.fiveCent(numbers,centNumber));

    }

   @Test
    public void round_up_5cent_moreThan5(){

        double numbers=3.36;

        double round_number=3.40;
       int centNumber=5;

        Assert.assertEquals("cent does not match", round_number, RoundUp.fiveCent(numbers,centNumber));

    }

    @Test
    public void round_up_5cent_equal5(){

        double numbers=3.35;
        double round_number=3.35;
        int centNumber=5;

        Assert.assertEquals("cent does not match", round_number, RoundUp.fiveCent(numbers,centNumber));

    }

    @Test
    public void round_up_5cent_divisible5(){

        double numbers=3.40;
        double round_number=3.40;
        int centNumber=5;

        Assert.assertEquals("cent does not match", round_number, RoundUp.fiveCent(numbers,centNumber));

    }

   @Test
    public void round_up_5cent_ZeroZero(){

        double numbers=3.00;
        double round_number=3.00;
        int centNumber=5;

        Assert.assertEquals("cent does not match", round_number, RoundUp.fiveCent(numbers,centNumber));

    }

    @Test
    public void round_up_5cent_round(){

        double numbers=3.99;
        double round_number=4.00;
        int centNumber=5;

        Assert.assertEquals("cent does not match", round_number, RoundUp.fiveCent(numbers,centNumber));

    }



}
