import java.util.*;

public class factorialvoid {

public static void calculateFactorial(int n){
int f =1;
for(int i=n; i>=1; i--){
f= f*i;
}
System.out.print(f);

}


    public static void main(String [] args ){
Scanner sc = new Scanner(System.in);
System.out.print("Enter number:");
int n = sc.nextInt();
calculateFactorial(n);

}   
}
