package training.ideas.java.Math_Calculation;

/**
 * Created by idnsrb on 8/12/2014.
 */
public class FindAngle {
    public static double calulateAngle(int hour, int minute) {

        int angleRotateByMinuteHand=minute*6;
        double angleRotateByHourHand=(hour*30)+(minute*0.5);

        double angleBetweenHourAndMinute=angleRotateByMinuteHand-angleRotateByHourHand;

        if(angleBetweenHourAndMinute<0){
            angleBetweenHourAndMinute=360+angleBetweenHourAndMinute;
            return angleBetweenHourAndMinute;
        }

        return angleBetweenHourAndMinute ;
    }
}
