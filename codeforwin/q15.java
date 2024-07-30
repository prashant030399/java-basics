import java.util.*;
public class q15 {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int f=1;

   while(n!=0){
    f= f * (n%10);
    n = n/10;
   }
   System.out.print(f);
    }
 
}



