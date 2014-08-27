package training.ideas.java.datStructure;

import junit.framework.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by idnsrb on 8/27/2014.
 */
public class SetManipulationTest {
    @Test
    public void getUniqueTest(){
        String [] inputString={"IE","mozilla","IE","Chrome","Safari","Chrome"};
        Set<String> uniqueOutput= new HashSet<String>();
        uniqueOutput.add("IE");
        uniqueOutput.add("mozilla");
        uniqueOutput.add("Chrome");
        uniqueOutput.add("Safari");
        Assert.assertEquals(uniqueOutput, SetManipulation.getUniqueRecord(inputString));

    }
}
