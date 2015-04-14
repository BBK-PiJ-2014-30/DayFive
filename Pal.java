/**
 * Created by devon on 14/04/2015.
 */
public class Pal {

    public boolean palndrome ( String str){
        int n =0;
        int length = str.length();
        if ( str.length()-1== 0){
            return false;
        }
        if ( str.charAt(str.length()/2-1) ==str.charAt(str.length()-1)){
            return true;
        }
        else
            if (str.charAt(n) == str.charAt(--length )) {

                palndrome(str.substring( n+1,length));}

            return true;
        }

    }

