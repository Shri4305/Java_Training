package training.ideas.java.datStructure;

import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by idnsrb on 8/27/2014.
 */
public class ListManipulationTest {

    @Test
    public void getListSize(){
        List<String> input = new ArrayList<String>();
        for (int i = 1; i < 51 ; i++) {
            input.add(i+"");
        }
        Assert.assertEquals(50, ListManipulation.getSize(input));
    }

}


