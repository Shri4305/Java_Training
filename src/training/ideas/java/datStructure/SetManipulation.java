package training.ideas.java.datStructure;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by idnsrb on 8/27/2014.
 */
public class SetManipulation {
    public static Set<String> getUniqueRecord(String[] inputString) {

        Set<String> output=new HashSet<String>();

        for (int i = 0; i < inputString.length; i++) {
            output.add(inputString[i]);
        }

       // System.out.println(output);
        return output;
    }
}
