package training.ideas.java.stringOpration;

/**
 * Created by idnsrb on 8/14/2014.
 */
public class Swap_Char {
    public static String[] stringCombination(String inputString) {

        int lengthOfString=inputString.length();
        String [] requiredOutput=new String[lengthOfString];
       /* int index=0;
       requiredOutput[index]=inputString;
        String temp=inputString+"";
        for(int counter=0;counter<lengthOfString-1;counter++) {
            String output = temp.substring(1, lengthOfString);
            String hold = temp.charAt(0) + "";
            String swapString=output + "" + hold + "";
            requiredOutput[counter + 1] =swapString;
             temp = swapString;
        }*/

        for(int counter=0;counter<lengthOfString;counter++){
            requiredOutput[counter]=inputString+"";
            inputString=inputString.substring(1)+inputString.substring(0,1);
        }

        return  requiredOutput;
    }
}
