/**
 * Created by devon on 14/04/2015.
 */
public class FactorialNum {

    public int factorial ( int n){
        if ( n==1){
            return n;
        }
        else return (n* factorial(n-1));
    }
}
