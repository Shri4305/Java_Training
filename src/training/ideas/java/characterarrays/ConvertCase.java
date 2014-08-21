package training.ideas.java.characterarrays;

/**
 * Created by idnsrb on 8/18/2014.
 */
public class ConvertCase {
    public static char[] convertInLowerCase(char[] givenCharacterArray) {
         for(int counter=0;counter<givenCharacterArray.length;counter++){
             if(Character.isUpperCase(givenCharacterArray[counter])){
                 givenCharacterArray[counter]=Character.toLowerCase(givenCharacterArray[counter]);
             }
         }

        return givenCharacterArray;
    }

    public static char[] convertInUpperCase(char[] givenCharacterArray) {

        for(int counter=0;counter<givenCharacterArray.length;counter++) {
            if(Character.isLowerCase(givenCharacterArray[counter])){
                givenCharacterArray[counter]=Character.toUpperCase(givenCharacterArray[counter]);
            }
        }
        return givenCharacterArray;
    }
}
