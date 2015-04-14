/**
 * Created by devon on 14/04/2015.
 */
public class FibonacciNum {
    public int fib ( int n){
        int result;
        if ( n == 1 || n==2){
            return n;
        }
        else

        return fib(n-1)+ fib(n-2);
    }
}
