package training.ideas.java.characterarrays;

/**
 * Created by idnsrb on 8/18/2014.
 */
public class FindOccurrenceIndex_CharacterGiven {
    public static int findNextOccurrence(char[] givenArray, char character,int index) {
         for(int counter=index+1;counter<givenArray.length;counter++){
             if(givenArray[counter]==givenArray[index]){
                 return counter;
             }
         }

        return -1;
    }
}
