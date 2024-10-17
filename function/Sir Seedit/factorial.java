import java.util.*;

class Factorial {
    
void factorial(int a){
    int f=1;
for(int i=a ; i>=1 ; i--){
    f=f*i;
}
System.out.print(f);
}

public static void main(String args []){

    Scanner sc = new Scanner (System.in);
    int a= sc.nextInt();
    Factorial x = new Factorial();

x.factorial(a);

}
}

