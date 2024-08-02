import java.util.Scanner;
import java.lang.Math; // Ensure Math is imported correctly

public class q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the end number:");
        int end = sc.nextInt();

        int digit, sum, i, n;

        for (i = 1; i <= end; i++) {
            sum = 0;
            n = i;
    

            while (n > 0) {
                digit = n % 10;
                sum += digit * digit * digit;
                n = n / 10;
            }

            if (i == sum) {
                System.out.println(i + " is an Armstrong number.");
            }
        }
    }
}







