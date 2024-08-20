import java.util.*;

public class hollowrhombuschatgpt {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {


            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print the hollow rhombus
            for (int j = 1; j <= rows; j++) {
                if (i == 1 || i == rows || j == 1 || j == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Move to the next line after each row
            System.out.println();
        }
         
    }
}





