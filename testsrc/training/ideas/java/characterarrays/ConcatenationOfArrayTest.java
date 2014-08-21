package training.ideas.java.characterarrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnsrb on 8/18/2014.
 */
public class ConcatenationOfArrayTest {



        @Test
        public void concatenation_TwoCharacterArray(){
            char [] firstArray={'a','b','c','d'};
            char [] secondArray ={'e','f','g','h'};
            char [] requiredArray={'a','b','c','d','e','f','g','h'};
            Assert.assertArrayEquals(requiredArray, ConcatenationOfArray.concatenation(firstArray, secondArray));

        }


}
