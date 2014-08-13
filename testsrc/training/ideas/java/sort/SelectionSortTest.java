package training.ideas.java.sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnsrb on 8/6/2014.
 */
public class SelectionSortTest {

    @Test
    public void orderNumbersPositiveNegativeNumber(){
        int [] Numbers={100,-50,30,40,125};
        int[] SortNum={-50,30,40,100,125};
        Assert.assertArrayEquals("Addition integer pulse integer does not match2", SortNum, SelectionSort.selectionSortAsc(Numbers));
    }

    @Test
    public void orderNumbersAllNegativeNumber(){
        int [] Numbers={-100,-50,-30,-40,-125};
        int[] SortNum={-125,-100,-50,-40,-30};
        Assert.assertArrayEquals("Addition integer pulse integer does not match", SortNum, SelectionSort.selectionSortAsc(Numbers));
    }

    @Test
    public void orderNumbers_Desc_PositiveNumber(){
        int [] Numbers={1,3,2,5};
        int[] SortNum={5,3,2,1};
        Assert.assertArrayEquals("Addition integer pulse integer does not match", SortNum, SelectionSort.selectionSortDesc(Numbers));
    }


}
