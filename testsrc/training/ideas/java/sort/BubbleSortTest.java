package training.ideas.java.sort;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnsrb on 7/28/2014.
 */
public class BubbleSortTest {


    @Test
    public void orderNumbersPositive_BubbleSort(){
        int [] GivenNumbers={4,3,1,10,15,25,125};
        int[] SortNum={1,3,4,10,15,25,125};
        int lengthOfSortedArray= SortNum.length;
        int lengthOfGivenArray=  GivenNumbers.length;

        Assert.assertArrayEquals("Addition integer pulse integer does not match ", SortNum, BubbleSort.Asc(GivenNumbers));
        Assert.assertEquals("Length of sorted array does not match",lengthOfSortedArray,lengthOfGivenArray);
    }

    @Test
    public void orderNumbersNegative_BubbleSort(){
        int [] GivenNumbers={-15,-25,-1,-100,-15};
        int[] SortNum={-100,-25,-15,-15,-1};
        int lengthOfSortedArray= SortNum.length;
        int lengthOfGivenArray=  GivenNumbers.length;
        Assert.assertArrayEquals("Sorting for negative Numbers not matched ", SortNum, BubbleSort.Asc(GivenNumbers));
        Assert.assertEquals("Length of sorted array does not match",lengthOfSortedArray,lengthOfGivenArray);
    }

    @Test
    public void orderNumbersDesc_BubbleSort(){
        int [] GivenNumbers={1,2,3};
        int[] SortNum={3,2,1};
        int lengthOfSortedArray= SortNum.length;
        int lengthOfGivenArray=  GivenNumbers.length;
        Assert.assertArrayEquals("Sorting for negative Numbers not matched ", SortNum, BubbleSort.Desc(GivenNumbers));
        Assert.assertEquals("Length of sorted array does not match",lengthOfSortedArray,lengthOfGivenArray);
    }

}
