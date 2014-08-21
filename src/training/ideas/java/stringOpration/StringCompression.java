package training.ideas.java.stringOpration;

/**
 * Created by idnsrb on 8/13/2014.
 */
public class StringCompression {
    public static String compression(String inputString) {

      int lengthOfString=inputString.length();
        String outputString="";

        int countNumber=1;

        for(int counter=0;counter<lengthOfString;counter++){
            if(counter+1<lengthOfString &&inputString.charAt(counter)==inputString.charAt(counter+1)){
                countNumber++;
                continue;
            }
            if(countNumber>1){
                outputString=outputString + inputString.charAt(counter-1)+""+countNumber+"";
                countNumber=1;
            }
            else{
                outputString=outputString + inputString.charAt(counter)+"";
            }

        }
        return outputString ;
    }
}
