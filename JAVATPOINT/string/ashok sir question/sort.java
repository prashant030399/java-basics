import java.util.Arrays;

public class sort {

    public static void main (String args []){

        String x="Adcb";

        char c [] = x.toCharArray();

Arrays.sort(c);

x = new String(c);

System.out.print(x);


    }
}