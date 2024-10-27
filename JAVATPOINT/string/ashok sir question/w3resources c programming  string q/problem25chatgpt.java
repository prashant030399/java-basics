import java.util.Scanner;

public class problem25chatgpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Input the character to replace spaces
        System.out.print("Enter the character to replace spaces: ");
        char replacementChar = scanner.next().charAt(0);

        // Replace spaces with the specified character
        String result = inputString.replace(' ', replacementChar);

        // Display the result
        System.out.println("Result: " + result);

        scanner.close();
    }
}
