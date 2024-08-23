

import java.util.*;

public class primevoid {

    public static void checkPrime(int a){
int c=0;
for(int i=1 ; i<=a ; i++){

    if(a%i==0){
        c++;
    }
}
if(c==2){
    System.out.print(a + " is a prime number ");
}  
else {
    System.out.print(a + " is not a prime number ");
}





    } 

    public static void main(String args []){
  Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        checkPrime(a);


    }
    
}
