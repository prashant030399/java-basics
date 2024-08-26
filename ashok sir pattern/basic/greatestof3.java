import java.util.*;
public class greatestof3 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        System.out.println("Enter 2nd number");
        System.out.println("Enter 3rd  number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

if(a>b && a>c){
    System.out.print("a is greatest");
}

else if(b>a && b>c){
    System.out.print("b is greatest");
}

else {
    System.out.print("c is greatest");
}


    }
    
}
