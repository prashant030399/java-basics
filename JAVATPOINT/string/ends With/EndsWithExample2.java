//Java String endsWith() Method Example 2
//Since the endsWith() method returns a boolean value, the method can also be used in an if statement. Observe the following program.

public class EndsWithExample2 {  
    public static void main(String[] args) {  
        String str = "Welcome to Javatpoint.com";  
        System.out.println(str.endsWith("point"));  
        if(str.endsWith(".com")) {  
            System.out.println("String ends with .com");  
        }else System.out.println("It does not end with .com");  
    }  
}  

