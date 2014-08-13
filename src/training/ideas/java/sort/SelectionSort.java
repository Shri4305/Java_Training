package training.ideas.java.sort;

/**
 * Created by idnsrb on 8/6/2014.
 */
public class SelectionSort {

    public enum selectionSortOrder{ ASCENDING,DESCENDING;}

    public static int [] selectionSortAsc(final int[] numbers)
    {
        return selectionSort(numbers,selectionSortOrder.ASCENDING);
    }

    public static int[] selectionSortDesc(final int [] numbers){
        return selectionSort(numbers,selectionSortOrder.DESCENDING);
    }




    private static int[] selectionSort(final int[] numbers,selectionSortOrder sortingOrder) {
        int lengthOfNumbers = numbers.length;
        int firstCounter=0 ;
        int temp = 0;
        for (int counter = 0; counter < lengthOfNumbers-1; counter++) {
            firstCounter = counter;
            for (int k = firstCounter+1; k < lengthOfNumbers; k++)
            {
                if (orderCondition (numbers[firstCounter],numbers[k],sortingOrder)) {
                    firstCounter = k;
                }
            }
            temp = numbers[counter];
            numbers[counter] = numbers[firstCounter];
            numbers[firstCounter] = temp;
        }
        return numbers;
    }

    private static boolean orderCondition( int LHS, int RHS, selectionSortOrder sortOrder){
        if(sortOrder==selectionSortOrder.ASCENDING){
            return LHS>RHS;
        }
        else return RHS>LHS;
    }
}
