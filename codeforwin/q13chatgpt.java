import java.util.Scanner;

public class   q13chatgpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();

        int num; int f; int l; int c; int swapn;

        // Handle single digit case
        if (n < 10 && n > -10) {
            System.out.println("The number after swapping first and last digits: " + n);
            return;
        }

        num = n;    
      c = (int) Math.log10(num);  // count of digits - 1  
      f = (int) (num / Math.pow(10, c));  // first digit
       l = num % 10;  // last digit

        // Remove the first and last digits from num
        num = num % (int) Math.pow(10, c);  // Remove the first digit
        num = num / 10;  // Remove the last digit

        // Reconstruct the number with swapped digits
       swapn = l * (int) Math.pow(10, c);  // Place last digit at the first position
        swapn += num * 10;  // Add the middle part of the number
        swapn += f;  // Place first digit at the last position

        // Preserve the sign for negative numbers
        if (n < 0) {
            swapn = -swapn;
        }

        System.out.println("The number after swapping first and last digits: " + swapn);
    }
}






