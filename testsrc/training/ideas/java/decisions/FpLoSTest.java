package training.ideas.java.decisions;

import junit.framework.Assert;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by idnsrb on 9/4/2014.
 */
public class FpLoSTest {
    @Test
    public void given_rateCode_ratePattern_OccupancyDate() throws ParseException {

        DateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
        Map<Date ,List<Double>> dateAndLRV = new HashMap<Date, List<Double>>();
        Map<String,Double> rateCodeValue= new HashMap<String, Double>();

        dateAndLRV.put(df.parse("10-Jan-2014"), Arrays.asList(100.0,0.0,150.0,125.0,120.0,100.0,100.0));
        dateAndLRV.put(df.parse("11-Jan-2014"), Arrays.asList(100.0,120.0,135.0,140.0,145.0,150.0,110.0));

        rateCodeValue.put("RateCode1",90.0);
        rateCodeValue.put("RateCode2",200.0);

        Map<String,String> rateCodeDecision =new TreeMap<String, String>();

        Map<Date,Map<String,String>> decision=new TreeMap<Date, Map<String, String>>();
        rateCodeDecision.put("RateCode1","NYYNNNN");

        Map<Map<String,String>,Integer> FpLosAndMinLosDecision =new HashMap<Map<String, String>, Integer>();
        FpLosAndMinLosDecision.put(rateCodeDecision,1);
        rateCodeDecision.put("RateCode2","YYYYYYY");
        decision.put(df.parse("10-Jan-2014"),rateCodeDecision);

        rateCodeDecision = new TreeMap<String, String>();
        rateCodeDecision.put("RateCode1","NNNNNNN");
        rateCodeDecision.put("RateCode2","YYYYYYY");
        decision.put(df.parse("11-Jan-2014"),rateCodeDecision);


        FpLoS FpLosCal=new FpLoS();
        Assert.assertEquals(decision,FpLosCal.analyzePattern(dateAndLRV,rateCodeValue));

    }

}
