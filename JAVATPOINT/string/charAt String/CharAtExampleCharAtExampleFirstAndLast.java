//Accessing First and Last Character by Using the charAt() Method


public class CharAtExampleCharAtExampleFirstAndLast {  
    public static void main(String[] args) {  
    String str = "Welcome to Javatpoint portal";      
    int strLength = str.length();      
    // Fetching first character  
    System.out.println("Character at 0 index is: "+ str.charAt(0));      
    // The last Character is present at the string length-1 index  
    System.out.println("Character at last index is: "+ str.charAt(strLength-1));      
    }  
}  
