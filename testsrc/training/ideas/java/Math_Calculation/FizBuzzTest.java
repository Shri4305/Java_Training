package training.ideas.java.Math_Calculation;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnsrb on 8/11/2014.
 */
public class FizBuzzTest {

   @Test
    public void printFizBuzz(){
        int givenNumber=15;
        String [] outPut={"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"};
        Assert.assertArrayEquals("Does Not Match ",outPut, FizBuzz.findFizBuzz(givenNumber));

    }

   /* @Test
    public void printFizBuzzstring(){
        int givenNumber=15;
        String outPut="12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz";
        Assert.assertEquals("Does Not Match ", outPut, FizBuzz.findFizBuzz(givenNumber));

    }*/
}
