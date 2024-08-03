import java.util.*;

public class q34chatgpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a strong number:");
        int n = sc.nextInt();

        int digit, sum = 0;
        int orn = n;

        while (n != 0) {
            digit = n % 10;

            int f = 1;
            for (int i = digit; i >= 1; i--) {
                f = f * i;
            }
            sum = sum + f;

            n = n / 10;
        }

        if (sum == orn) {
            System.out.println(orn + " is a strong number.");
        } else {
            System.out.println(orn + " is not a strong number.");
        }
    }
}

