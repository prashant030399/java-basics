import java.util.*;

public class q17 {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int n1 =n;
        int rev=0;
        
        while(n1!=0){
            rev = ( rev * 10) + (n1%10);
            n1= n1/10;
        }

if(rev==n){
    System.out.print(n+  " is pallindrom no." );
}
else {
    System.out.print(n+ " is not pallindrom no.");   
}
    }
}



