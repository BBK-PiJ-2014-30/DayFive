/**
 * Created by devon on 14/04/2015.
 */
public class Power {

    public static void main(String[] args) {
        int result;
        int power = pow(2,10);
        System.out.println(power);

    }
    public static int pow( int n, int p){
        int result = 0;
        if ( p==0){
            return 1;
        }
        else



        return n* pow(n,(p-1));


    }

}
