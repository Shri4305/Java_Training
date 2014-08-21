package training.ideas.java.characterarrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnsrb on 8/18/2014.
 */
public class FindCharTest {


    @Test
    public void find_IndexOfSecondChar(){
        char [] givenArray={'a','b','c','d'};
        char inputChar='b';
       Assert.assertEquals(1, FindChar.findIndex(givenArray,inputChar));

    }

    @Test
    public void ifCharisNotInArray(){
        char [] givenArray={'a','b','c','d'};
        char inputChar='e';
        Assert.assertEquals(-1, FindChar.findIndex(givenArray,inputChar));

    }
}
