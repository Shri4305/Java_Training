package training.ideas.java.characterarrays;

/**
 * Created by idnsrb on 8/18/2014.
 */
public class ReturnArrayIndexGiven {
    public static char[] returnArrayIndexGiven(char[] givenCharacterArray, int index) {

        if(index<givenCharacterArray.length) {
            char[] outputArray = new char[index+1];
            for (int counter = 0; counter<=index;counter++){
                outputArray[counter]=givenCharacterArray[counter];
            }
            return outputArray;
        }
        return givenCharacterArray;
    }
}
