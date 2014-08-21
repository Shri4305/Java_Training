package training.ideas.java.characterarrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnsrb on 8/18/2014.
 */
public class ReturnArray_Start_EndIndexGivenTest {

    @Test
    public void Given_array_given_endIndex_return_charArray(){
        char [] givenCharacterArray={'a','b','c','d'};
        int startIndex=1;
        int secondIndex=3;
        char [] requiredCharArray={'b','c','d'};
        Assert.assertArrayEquals(requiredCharArray, ReturnArray_Start_EndIndexGiven.returnArrayStartEndIndexGiven(givenCharacterArray, startIndex, secondIndex));
    }

    @Test
    public void Given_array_given_endIndex_return_charArray_SecondIndexGrater(){
        char [] givenCharacterArray={'a','b','c','d'};
        int startIndex=1;
        int secondIndex=1;
        char [] requiredCharArray={'b'};
        Assert.assertArrayEquals(requiredCharArray, ReturnArray_Start_EndIndexGiven.returnArrayStartEndIndexGiven(givenCharacterArray, startIndex,secondIndex));
    }
}
