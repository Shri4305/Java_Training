package training.ideas.java.characterarrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnsrb on 8/18/2014.
 */
public class ConvertUpperCaseCharTest {
    @Test

    public void convertInUpperCase_AllInLowerCase(){
        char [] givenCharacterArray={'a','b','c'};
        char [] requiredCharacterArray={'A','B','C'};

        Assert.assertArrayEquals(requiredCharacterArray,ConvertCase.convertInUpperCase(givenCharacterArray));

    }

    @Test

    public void convertInUpperCase_AllInUpperCase(){
        char [] givenCharacterArray={'A','B','C'};
        char [] requiredCharacterArray={'A','B','C'};
        Assert.assertArrayEquals(requiredCharacterArray,ConvertCase.convertInUpperCase(givenCharacterArray));

    }

    @Test

    public void convertInUpperCase_MixCharacter(){
        char [] givenCharacterArray={'A','b','C'};
        char [] requiredCharacterArray={'A','B','C'};
        Assert.assertArrayEquals(requiredCharacterArray,ConvertCase.convertInUpperCase(givenCharacterArray));

    }
}
