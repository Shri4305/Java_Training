package training.ideas.java.characterarrays;

/**
 * Created by idnsrb on 8/18/2014.
 */
public class ReturnArray_Start_EndIndexGiven {
    public static char[] returnArrayStartEndIndexGiven(char[] givenCharacterArray, int startIndex, int secondIndex) {

        int lengthOfOutputArray=secondIndex-startIndex;
        char[] outputArray = new char[lengthOfOutputArray+1];

        int tempCounter=0;
        for(int counter=startIndex;counter<=secondIndex;counter++){
           outputArray[tempCounter]=givenCharacterArray[counter];
            tempCounter++;
        }

        return outputArray;
    }
}
