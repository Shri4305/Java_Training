package training.ideas.java.Math_Calculation;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnsrb on 8/12/2014.
 */
public class Clock_AngleTest {

    @Test

    public void Hr_Min_Angle(){

        int hour=12;
        int minute = 23;

        double angle=126.5;

        Assert.assertEquals(angle,FindAngle.calulateAngle(hour,minute));
    }

    @Test

    public void Hr_Min_Angle1(){

        int hour=2;
        int minute = 01;

        double angle=305.5;

        Assert.assertEquals(angle,FindAngle.calulateAngle(hour,minute));
    }

    @Test

    public void Hr_Min_Angle_Time_Is_6_35(){

        int hour=6;
        int minute = 35;

        double angle=12.5;

        Assert.assertEquals(angle,FindAngle.calulateAngle(hour,minute));
    }
}
