package training.ideas.java.Series;

/**
 * Created by idnsrb on 8/7/2014.
 */
public class FibonacciNumber {

    //fibonacciCalculationRecursion

    public static int[] fibonacciCalculationRecursion(int num){
        int[] fibonacci = new int[num];
        for (int counter=0;counter<fibonacci.length;counter++){
        fibonacci[counter]=fibonacciCalculation(counter);
        }
        return fibonacci;
    }


    private static int  fibonacciCalculation(int num) {

        if (num==0)
            return 0;
        else if (num == 1){
        return 1;
        }
       else {

            return fibonacciCalculation(num - 1) + fibonacciCalculation(num - 2);
        }
    }
}
