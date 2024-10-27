//WAP in java to read a sentence and replace lowercase chararcter with uppercase and vice-versa 
import java.util.*;

public class problem15 {

public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
String x = sc.next();
String y= "";

for(int i=0 ; i<x.length() ; i++){
    char p = x.charAt(i);
if(p>=65 && p<=90){
y = y + ((char)(p+32)); 
} else if(p>=97 && p<=122){
    y = y + ((char)(p-32));
}
}
System.out.print(y);
    }
    
}
