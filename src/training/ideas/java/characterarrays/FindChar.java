package training.ideas.java.characterarrays;

/**
 * Created by idnsrb on 8/18/2014.
 */
public class FindChar {
    public static int findIndex(char[] givenArray, char inputChar) {
  for(int counter=0;counter<givenArray.length;counter++){
          if(givenArray[counter]==inputChar){
               return counter;
           }
       }
        return -1;

    }
}
