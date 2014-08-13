package training.ideas.java.Math_Calculation;

/**
 * Created by idnsrb on 7/22/2014.
 */



public class Addition {


 public static double add(double... num)
    {

        double result =0;
        for (double numb:num){
            result=result+numb;
        }
      return result;

    }

}

