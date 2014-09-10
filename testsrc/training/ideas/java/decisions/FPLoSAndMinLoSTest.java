package training.ideas.java.decisions;

import junit.framework.Assert;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 * Created by idnsrb on 9/4/2014.
 */

public class FPLoSAndMinLoSTest {
   @Test
    public void give_rateCode_rate_andPattern_forOccupancyDate() throws Exception
    {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        Map<Date,List<Double>> LRVMap = new HashMap<Date,List<Double>>();
        Map<String,Double> RateSpectrumMap = new HashMap<String,Double>();
        Set<Date> setOfOccupancyDates = new HashSet<Date>();

        setOfOccupancyDates.add(df.parse("2010-10-10"));
        setOfOccupancyDates.add(df.parse("2010-10-11"));
        setOfOccupancyDates.add(df.parse("2010-10-12"));

        RateSpectrumMap.put("RATE1",100.00);
        RateSpectrumMap.put("RATE2",200.00);
        RateSpectrumMap.put("RATE3",250.10);

        LRVMap.put(df.parse("2010-10-10"), Arrays.asList(100.0, 20.0, 30.0, 40.0, 50.0, 60.0, 70.0));
        LRVMap.put(df.parse("2010-10-11"), Arrays.asList(25.0,23.0,55.5,40.25,100.0,150.0,158.0));
        LRVMap.put(df.parse("2010-10-12"), Arrays.asList(150.0,0.0,20.0,41.0,55.0,16.0,70.1));

        Map<Date,Map<String,String>> FPLOSDecision=new TreeMap<Date, Map<String, String>>();

        Map<String,String> RateCodeWiseDecision=new TreeMap<String, String>();

        RateCodeWiseDecision.put("RATE1","YYYYYYY");
        FPLOSDecision.put(df.parse("2010-10-10"),RateCodeWiseDecision);
        RateCodeWiseDecision.put("RATE2","YYYYYYY");
        FPLOSDecision.put(df.parse("2010-10-10"),RateCodeWiseDecision);
        RateCodeWiseDecision.put("RATE3","YYYYYYY");
        FPLOSDecision.put(df.parse("2010-10-10"),RateCodeWiseDecision);

        RateCodeWiseDecision.put("RATE1","YYYYYYY");
        FPLOSDecision.put(df.parse("2010-10-11"),RateCodeWiseDecision);
        RateCodeWiseDecision.put("RATE2","YYYYYYY");
        FPLOSDecision.put(df.parse("2010-10-11"),RateCodeWiseDecision);
        RateCodeWiseDecision.put("RATE3","YYYYYYY");
        FPLOSDecision.put(df.parse("2010-10-11"),RateCodeWiseDecision);

        RateCodeWiseDecision.put("RATE1","NYYYYYY");
        FPLOSDecision.put(df.parse("2010-10-12"),RateCodeWiseDecision);
        RateCodeWiseDecision.put("RATE2","YYYYYYY");
        FPLOSDecision.put(df.parse("2010-10-12"),RateCodeWiseDecision);
        RateCodeWiseDecision.put("RATE3","YYYYYYY");
        FPLOSDecision.put(df.parse("2010-10-12"),RateCodeWiseDecision);



        // Map<Date, Map<String,String>> FPLOSDecision = new TreeMap<Date,Map<setOfOccupancyDates,RateSpectrumMap>>();
        //  new FPLOSCalculator().fplosDecicions(setOfOccupancyDates,LRVMap, RateSpectrumMap);

        Assert.assertEquals(FPLOSDecision, new FPLoSAndMinLoS().fplosDecicions(setOfOccupancyDates,LRVMap, RateSpectrumMap));

    }

}
