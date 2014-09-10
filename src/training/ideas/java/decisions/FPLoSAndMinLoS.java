package training.ideas.java.decisions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by idnsrb on 9/4/2014.
 */
public class FPLoSAndMinLoS {
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    public Map<Date, Map<String,String>> fplosDecicions(Set<Date> setOfOccupancyDates, Map<Date,List<Double>> lrvMap, Map<String, Double> rateSpectrumMap) {

        Map<Date, Map<String,String>> decision=new TreeMap<Date, Map<String, String>>();

        Map<String,String> rateDecision=null;
        for(Date D1:setOfOccupancyDates)
        {
            rateDecision=new HashMap<String, String>();
            //double rate=10.52;
            List<Double> lrvList= lrvMap.get(D1);
            //Iterator entries = rateSpectrumMap.entrySet().iterator();
            //Iterator lrvEntries = lrvMap.entrySet().iterator();
            Set<String> rateCode= rateSpectrumMap.keySet();
            for (String rateCode1:rateCode )
            {
                double rateCodeValue=  rateSpectrumMap.get(rateCode1);
                String pattern="";
                //while (entries.hasNext()) {

                double sumLRV = 0;
                int LOScount=1;
                for(Double currentLRV : lrvList)
                {
                    sumLRV = sumLRV + currentLRV;

                    if((rateCodeValue * LOScount) >= sumLRV){
                        //  System.out.print("Y");
                        pattern=pattern+"Y";
                    }
                    else
                    {
                        //   System.out.print("N");
                        pattern=pattern+"N";
                    }
                    LOScount++;
                }
                rateDecision.put(rateCode1, pattern);
            }
            decision.put(D1,rateDecision);
            //}
            // }
        }
        return decision;
    }
}


