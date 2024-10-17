
import java.util.*;

class Practice1 {
    
void factorial(int a ){
int f=1;
for(int i=a ;i>=1; i--){
    f= f*i;
}
System.out.print(f);
} 


public static void main (String args []){
Scanner sc = new Scanner (System.in);
int a = sc.nextInt();
Practice1 x = new Practice1();
x.factorial(a);

}
}
