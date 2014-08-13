package training.ideas.java.decisions;

/**
 * Created by idnsrb on 8/6/2014.
 */
public class FpLoscal {
    public static String fpLossPattern(final double rate, final double[] lrv) {
        double sumoflrv=0;
        int  rateCounter=1;
        String strpattern="";
        for (double lrvs:lrv){
            sumoflrv+=lrvs;
            if(sumoflrv<=(rate*rateCounter))
                strpattern+="Y";
            else
                strpattern+="N";

            rateCounter++;

        }
        return strpattern;
    }

    public static String[] fpLossPattern(final double[] rates, final double[] lrv) {
        String[] strpattern= new String[rates.length];
        int counter =0;
        for (double rate:rates)
        {
            strpattern[counter++]=fpLossPattern(rate,lrv);
        }
        return strpattern;
    }
}
