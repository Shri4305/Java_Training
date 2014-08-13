package training.ideas.java.Math_Calculation;

/**
 * Created by idnsrb on 8/11/2014.
 */
public class FizBuzz {


    public static String[] findFizBuzz(int givenNumber) {
        String [] hold=new String[givenNumber];

       for(int counter=0;counter<givenNumber;counter++) {

        if((counter+1)%3==0 && (counter+1)%5==0 ){
           hold [counter]="FizzBuzz";
        }

        else if((counter+1)%3==0){
               hold [counter]="Fizz";
           }
        else if((counter+1)%5==0){
               hold [counter]="Buzz";
           }
       else {
               hold [counter]= counter+1+"";
        }

      }
      return hold;
    }
}
