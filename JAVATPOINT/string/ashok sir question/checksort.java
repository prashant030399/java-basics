import java.util.Arrays;

public class checksort {
    
public static void main(String[] args) {
    
String x = "Abcd";

char c[] = x.toCharArray();

Arrays.sort(c);

 String x1 = new String(c);
 
if(x1.equals(x)){
    System.out.print("yes it is sorted");
} else {
    System.out.print("not sorted");
}

}

}
