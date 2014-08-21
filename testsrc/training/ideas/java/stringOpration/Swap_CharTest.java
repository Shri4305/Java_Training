package training.ideas.java.stringOpration;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by idnsrb on 8/14/2014.
 */
public class Swap_CharTest {
    @Test

    public void travels_string(){
       String inputString="ABC";
       String [] output={"ABC","BCA","CAB"};
       Assert.assertArrayEquals(output, Swap_Char.stringCombination(inputString));

    }
}
