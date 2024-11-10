import java.util.*;

class Factorial {
    
public int factorial(int n){
int f=1;
    for(int i=n ;i>=1 ; i--){
    f= f*i;
}
return f;

}

public static void main(String[] args) {
    Scanner sc = new  Scanner(System.in);
    int n =sc.nextInt();
    Factorial x = new Factorial();
int result = x.factorial(n);
System.out.print(result);

}

}
