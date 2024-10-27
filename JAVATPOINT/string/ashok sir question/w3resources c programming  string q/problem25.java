//WAP in java to replace the spaces in  string with a specific character 

import java.util.*;

public class problem25 {
public static void main (String  args []) {

Scanner sc = new Scanner (System.in);

String x = sc.nextLine();
char c = sc.next().charAt(0);

String result  = x.replace(' ',c);

System.out.print(result);

}
}
    

