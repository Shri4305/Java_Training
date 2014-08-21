package training.ideas.java.characterarrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnsrb on 8/18/2014.
 */
public class FindOccurrence_IndexCharacterGivenTest {

    @ Test
    public void findNextOccurrenceWhenIndexAndCharGiven(){

        char[] givenArray={'a','b','d','e','b'};
        char character='b';
        int index=1;
       Assert.assertEquals(4, FindOccurrenceIndex_CharacterGiven.findNextOccurrence(givenArray, character,index));

    }

    @ Test
    public void findNextOccurrenceWhenIndexAndCharGiven_AndCharIsNotPresent(){

        char[] givenArray={'a','b','d','e','b'};
        char character='e';
        int index=3;
        Assert.assertEquals(-1, FindOccurrenceIndex_CharacterGiven.findNextOccurrence(givenArray, character,index));

    }

    @ Test
    public void findNextOccurrenceWhenIndexAndCharGiven_MoreThanTwoTimes(){

        char[] givenArray={'a','b','d','e','b','b'};
        char character='e';
        int index=4;
        Assert.assertEquals(5, FindOccurrenceIndex_CharacterGiven.findNextOccurrence(givenArray, character,index));

    }
}
