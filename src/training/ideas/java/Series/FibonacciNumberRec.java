package training.ideas.java.Series;

/**
 * Created by idnsrb on 8/11/2014.
 */
public class FibonacciNumberRec {

    public static int[] fibonacciNumberSeries(int number) {
        int[] fib = new int[number];
        series(number, fib);
        return fib;
    }
    private static void series(int number,int[] fib){

        if(number==0) {
            return;
        }
        if(number==1){
            fib[0]=0;
            return;
        }
        if(number==2) {
            fib[1] = 1;
            return;
        }
       series(number-1,fib);
            fib[number-1]= fib[number-2]+fib[number-3];
            return;
       }
  }

