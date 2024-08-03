import java.util.*;

public class q35chatgpt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number until which you want to find strong numbers: ");
        int end = sc.nextInt();

        for (int i = 1; i <= end; i++) {
            int number = i; // Store the current number
            int sum = 0;

            while (number != 0) {
                int digit = number % 10;
                int factorial = 1;

                for (int j = digit; j >= 1; j--) {
                    factorial *= j;
                }

                sum += factorial;
                number /= 10;
            }

            if (sum == i) {
                System.out.println(i + " is a strong number.");
            }
        }
        sc.close();
    }
}

