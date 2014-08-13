package training.ideas.java.Math_Calculation;

/**
 * Created by idnsrb on 8/11/2014.
 */
public class RoundUp {

    public static double fiveCent(double numbers,int centNumber) {

      //double roundedNumber= Math.ceil((numbers * 20)) / 20;
        double roundedNumber;
      if ((numbers*100)%centNumber==0){
           roundedNumber=numbers;
      }
        else {
           roundedNumber = (numbers * 100 + ((centNumber - (numbers * 100) % centNumber))) / 100;
      }
        return roundedNumber;

    }
}
