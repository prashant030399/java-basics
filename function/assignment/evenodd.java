import java.util.*;

public class evenodd {

    public static String checkEvenOdd(int a) {
        if(a % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        String result = checkEvenOdd(a);
        System.out.println("The number " + a + " is " + result);
    }
}




