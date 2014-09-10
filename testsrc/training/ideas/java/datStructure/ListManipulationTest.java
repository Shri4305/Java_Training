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

    @Test
    public void getListOdd(){
        List<Integer> output = new ArrayList<Integer>();
        int [] inputList={15,150,23,1111,125,136,186,124,136,136,127,133};
        output.add(15);
        output.add(23);
        output.add(1111);
        output.add(125);
        output.add(127);
        output.add(133);

        Assert.assertEquals(output, ListManipulation.getOddNumber(inputList));
    }



}


