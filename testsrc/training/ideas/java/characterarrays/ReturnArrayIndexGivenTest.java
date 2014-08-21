package training.ideas.java.characterarrays;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnsrb on 8/18/2014.
 */
public class ReturnArrayIndexGivenTest {

    @Test
    public void Given_array_given_endIndex_return_charArray(){
        char [] givenCharacterArray={'a','b','c','d'};
        int index=1;
        char [] requiredCharArray={'a','b'};
        Assert.assertArrayEquals(requiredCharArray,ReturnArrayIndexGiven.returnArrayIndexGiven(givenCharacterArray,index));
    }

    @Test
    public void Given_array_given_endIndex_return_charArrayIFGivenIndexIsMoreThanArraySize(){
     char [] givenCharacterArray={'a','b','c','d'};
        int index=5;
        char [] requiredCharArray={'a','b','c','d'};
        Assert.assertArrayEquals(requiredCharArray,ReturnArrayIndexGiven.returnArrayIndexGiven(givenCharacterArray,index));
    }
}
