package training.ideas.java.characterarrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnsrb on 8/18/2014.
 */
public class ConvertLowerCaseTest {

    @Test

    public void ConvertInLowerCase_AllInUpperCase(){

        char [] givenCharacterArray={'A','B','C'};
        char [] requiredCharacterArray={'a','b','c'};

        Assert.assertArrayEquals(requiredCharacterArray, ConvertCase.convertInLowerCase(givenCharacterArray));

    }
}
