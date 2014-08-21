package training.ideas.java.characterarrays;

/**
 * Created by idnsrb on 8/18/2014.
 */

public class ConcatenationOfArray {

 public static char[] concatenation(char[] firstArray, char[] secondArray) {
        int lengthOfFirstArray=firstArray.length;
        int lengthOfSecondArray=secondArray.length;
        int totalLength=lengthOfFirstArray+lengthOfSecondArray;

        char [] outputCharArray= new char[totalLength];

        for(int counter=0;counter<lengthOfFirstArray;counter++){
          outputCharArray[counter]=firstArray[counter];
        }

        for (int index=0;index<lengthOfSecondArray;index++) {
         outputCharArray[index+lengthOfFirstArray]=secondArray[index];
       }

        return outputCharArray;
    }
}

