import java.util.*;

public class addpractice{

    public static int calculateSum(int a, int b ){
int sum = a+b;
return sum;

    }

    public static void main(String args []){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the value of a ");
         int a = sc.nextInt();
         System.out.print("Enter the value of b ");

int b= sc.nextInt();

int sum = calculateSum(a,b);
  System.out.print("Sum of " + a + " & "+ b + " is " + sum);


    }
}


