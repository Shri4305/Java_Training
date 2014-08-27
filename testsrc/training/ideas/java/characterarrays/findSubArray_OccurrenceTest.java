package training.ideas.java.characterarrays;



import junit.framework.Assert;
import org.junit.Test;


/**
 * Created by idnsrb on 8/25/2014.
 */
public class findSubArray_OccurrenceTest {

    @Test
        public void indexTestForSubArray()
    {
        int index=4;
        char[] mainArray={'s','d','f','g','a','b'};
        char[] subArray={'a','b'};

        Assert.assertEquals(index, findSubArray_Occurrence.firstOccIndexOfSubArray(mainArray, subArray));


    }

    @Test
    public void indexTestForSubArray_NotFound()
    {
        int index=-1;
        char[] mainArray={'s','d','f','g','a','c','b'};
        char[] subArray={'a','b'};

        Assert.assertEquals(index, findSubArray_Occurrence.firstOccIndexOfSubArray(mainArray, subArray));


    }

}
