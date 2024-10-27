//WAP in java to find the frequency of characters 
import java.util.*;

public class problem18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        char c = sc.next().charAt(0);
int count =0;

        for(int i=0 ; i<x.length() ; i++){
            if(x.charAt(i)==c){
                count ++;
            }
        }
        
System.out.print(count);

    }
    
}
