package training.ideas.java.datStructure;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by idnsrb on 8/27/2014.
 */
public class ListManipulation {
    public static int getSize(List<String> input) {
        return input.size();
    }

    public static  List<Integer> getOddNumber(int[] inputList) {
        List<Integer> resultList =new ArrayList<Integer>();
        for (int i = 0; i < inputList.length; i++) {
            if (inputList[i]%2!=0){
                resultList.add(inputList[i]);
            }
        }
        return resultList;
    }
}
