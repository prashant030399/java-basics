import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name ");
        String name = input.nextLine();

        // Print the input
        System.out.println(name);

        // Close the Scanner object
        input.close();
    }
}

















