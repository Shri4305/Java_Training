package training.ideas.java.sort;

/**
 * Created by idnsrb on 7/28/2014.
 */
public class BubbleSort {

    public enum  SortingOrder {
        ASCENDING,DESCENDING;
    }


    public static int[] bubbleSortAsc(final int[] givenNumbers) {
        return bubbleSort(givenNumbers,SortingOrder.ASCENDING);
    }

    public static int[] bubbleSortDesc(final int[] givenNumbers) {
        return bubbleSort(givenNumbers,SortingOrder.DESCENDING);
    }

   private static int[] bubbleSort(final int[] givenNumbers,SortingOrder s)
   {
       int lengthOfGivenNumbers=givenNumbers.length;
       for (int counter=0;counter<lengthOfGivenNumbers-1;counter++)
       {
           for (int swapCounter = 0; swapCounter < lengthOfGivenNumbers - 1-counter; swapCounter++) {
               if (sortCondition(givenNumbers[swapCounter], givenNumbers[swapCounter + 1],s))
               {
                   int tempHoldNum = givenNumbers[swapCounter];
                   givenNumbers[swapCounter] = givenNumbers[swapCounter + 1];
                   givenNumbers[swapCounter + 1] = tempHoldNum;
               }
           }
       }
       return givenNumbers;
   }

    private static boolean  sortCondition(int LHS,int RHS,SortingOrder s)
    {
        if (s==SortingOrder.ASCENDING)
        {
            return LHS >RHS;
        }
        else return LHS<RHS;
    }

}
