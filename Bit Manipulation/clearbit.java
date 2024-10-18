import java.util.*;

public class clearbit{

    public static void main(String[] args) {
 
        int n=5;   //0101
        int pos = 2;
        int bitmask = 1<<pos;

        int newbitmask = ~(bitmask);
        int newnumber = newbitmask & n;
        System.out.print(newnumber); 

    }

}
