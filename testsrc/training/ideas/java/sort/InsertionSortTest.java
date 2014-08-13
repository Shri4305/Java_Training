package training.ideas.java.sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnsrb on 8/6/2014.
 */
public class InsertionSortTest {
    @Test
    public void orderNumbersPositive_InsertionSort(){
        int [] Numbers={100,50,30,40,125};
        int[] SortNum={30,40,50,100,125};
        Assert.assertArrayEquals("Addition integer pulse integer does not match ", SortNum, InsertionSort.insertionSortAsc(Numbers));
    }


    @Test
    public void orderNumbersPositiveNegative_InsertionSort(){
        int [] Numbers={100,-50,30,40,125};
        int[] SortNum={-50,30,40,100,125};
        Assert.assertArrayEquals("Addition integer pulse integer does not match", SortNum, InsertionSort.insertionSortAsc(Numbers));
    }

    @Test
    public void Desc_InsertionSort(){
        int [] Numbers={2,1,3,4};
        int[] SortNum={4,3,2,1};
        Assert.assertArrayEquals("Addition integer pulse integer does not match", SortNum, InsertionSort.insertionSortDesc(Numbers));
    }



}
