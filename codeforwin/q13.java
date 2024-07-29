import java.util.Scanner;

public class   q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();

        if (n < 10 && n > -10) {
            System.out.println("The number after swapping first and last digits: " + n);
            return;
        }

        int num = n;    
        int c = (int) Math.log10(num);    
        int f = (int) (num / Math.pow(10, c));  
        int l = num % 10;  // last digit


        num = num % (int) Math.pow(10, c); 
        num = num / 10;  


        int swapn = l * (int) Math.pow(10, c);  
        swapn += num * 10;  
        swapn += f;  

      
        if (n < 0) {
            swapn = -swapn;
        }

        System.out.println("The number after swapping first and last digits: " + swapn);
    }
}
