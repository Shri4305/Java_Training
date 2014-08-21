package training.ideas.java.stringOpration;

/**
 * Created by idnsrb on 8/19/2014.
 */
public class PrintNamePyramid {

    public static void main (String args []){
       String inputString="abcd";
        String output="";
        String space="";
        String reversStringHold="";
        String outputRevers="";
        int lengthOfString=inputString.length();
        String hold ="";
        for(int counter=0;counter<lengthOfString;counter++){
            space="";
         hold=inputString.substring(counter,counter+1);
            output=hold+output+hold;
            for (int i = lengthOfString-1; i >counter ; i--) {
               space=space+" ";
        }

        System.out.println(space+output+space);
        }
        for (int j=0;j<lengthOfString;j++){
            output=output.substring(1,output.length()-1);
            space="";
            for (int i = 0; i <=j ; i++) {
                space=space+" ";
            }
            System.out.println(space+output+space);
        }
    }
}
