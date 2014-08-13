package training.ideas.java.sort;

/**
 * Created by idnsrb on 8/6/2014.
 */
public class InsertionSort {

    public enum insertionSortOrder {
        ASCENDING,DESCENDING;
    }
    public static int [] insertionSortDesc(final int[] numbers) {
         return insertionSort(numbers, insertionSortOrder.DESCENDING);
    }
    public static int [] insertionSortAsc(final int[] numbers){
        return insertionSort(numbers, insertionSortOrder.ASCENDING);
    }
       private static int[] insertionSort(final int[] numbers,insertionSortOrder order) {
            int lengthOfNumber = numbers.length;
            int swapCounter;
            int counter;

            for (int firstCounter = 0; firstCounter < lengthOfNumber; firstCounter++) {
                swapCounter = numbers[firstCounter];
                counter = firstCounter - 1;
                while (counter >= 0 && condition(numbers[counter],swapCounter,order)) {
                    numbers[counter + 1] = numbers[counter];
                    numbers[counter] = swapCounter;
                    counter = counter - 1;
                }
            }
            return numbers;
    }

    private static boolean condition(int LHS,int RHS,insertionSortOrder order){
        if (order==insertionSortOrder.ASCENDING){
            return LHS >RHS;
        }
        else return LHS<RHS;
    }


 }






