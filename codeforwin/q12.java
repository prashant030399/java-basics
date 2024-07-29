 import java.util.*;

 public class q12 {

    public static void main (String [] args ) {

        Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");

           int n =sc.nextInt();

      int f ; int l; int sum;
      f=n;

      while(f>10){
f= f/10;
      } 
      
      l =n%10;
      sum = f +l;

      System.out.print(sum);







    }
 }
