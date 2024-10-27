////WAP in java to read a string from the keyboard and sort it using bubble sort

import java.util.Scanner;

public class problem12chatgpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\nSorts the strings of an array using bubble sort :");
        System.out.println("-----------------------------------------------------");

        System.out.print("Input number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        String[] name = new String[n]; // Array to store the strings

        System.out.println("Input string " + n + " :");
        for (int i = 0; i < n; i++) {
            name[i] = sc.nextLine(); // Read strings from the user
        }

        // Logic for Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (name[j].compareTo(name[j + 1]) > 0) { // Compare adjacent strings
                    // Swap strings
                    String temp = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = temp;
                }
            }
        }

        System.out.println("The strings appear after sorting:");
        for (int i = 0; i < n; i++) {
            System.out.println(name[i]);
        }

        sc.close(); // Close the scanner
    }
}

