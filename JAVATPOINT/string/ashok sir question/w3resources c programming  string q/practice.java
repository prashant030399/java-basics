import java.util.*;

public class practice {

public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    String x = sc.nextLine();
x=x.toUpperCase();

    int a[] = new int [26];

    for(int i=0 ; i<x.length(); i++){
     if(x.charAt(i)>=65 && x.charAt(i)<=90){
        a[x.charAt(i)-65]++ ;
     }
    }

    int max = -1 ;
    int maxChar =0;

    for(int i=0 ; i<26 ; i++){
        if(a[i]>max){
            max = a[i];
            maxChar = i;
        }
    }

System.out.print(((char)(maxChar+ 65)) + " - " + max);

    }
}
