package training.ideas.java.characterarrays;

import java.util.Arrays;

/**
 * Created by idnsrb on 8/25/2014.
 */
public class findSubArray_Occurrence {
        public static int firstOccIndexOfSubArray( char[] mainArray, char[] subArray) {

       int lastIndexOfSubArray=subArray.length-1;

            for(int j=0;j<mainArray.length&&lastIndexOfSubArray<mainArray.length;j++)
        {
             if(Arrays.equals(subArray, Arrays.copyOfRange(mainArray, j, j + lastIndexOfSubArray + 1)))
           {
                    return j;
            }

        }
         return -1;
       }
}



