package training.ideas.java.decisions;
import org.junit.Test;
import sun.awt.SunHints;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by idnsrb on 9/5/2014.
 */
public  class FpLoS {

    public Map<Date, Map<String, String>> analyzePattern(Map<Date, List<Double>> dateAndLRV,  Map<String, Double> rateCodeValue) {

        Map<Date,Map<String,String>> finalDecision=new TreeMap<Date, Map<String, String>>();

        Set<Date> date=dateAndLRV.keySet();
        Set<String> rateCode=rateCodeValue.keySet();
        //Collection<Double> rateValues=rateCodeValue.values();
          //for(Iterator<Date> eachDates=date.iterator();eachDates.hasNext();){
        for(Date eachDates:date){
              List<Double> eachLRV=dateAndLRV.get(eachDates) ;
            Map<String,String> rateDecision=new TreeMap<String, String>();
            //for (Iterator<String> eachRate=rateCode.iterator();eachRate.hasNext();){
            for (String eachRate:rateCode){
                Double rate=rateCodeValue.get(eachRate);
                Double sumLrv = 0.0;
                Double sumRate=1.0;
                String pattern="";
                for ( Double eachLRVValue:eachLRV){
                    sumLrv += eachLRVValue;
                  if(sumLrv<=(rate*sumRate)){
                        pattern+="Y";
                    }
                    else{
                        pattern+="N";
                    }
                    sumRate++;
                  }

                rateDecision.put(eachRate,pattern);

            }
            finalDecision.put(eachDates,rateDecision);
        }
        return finalDecision;
    }
}
