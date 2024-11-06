//Java String equals() Method Example 2
//The equals() method compares two strings and can be used in if-else control structure.
public class EqualsExample2 {  
    public static void main(String[] args) {  
        String s1 = "javatpoint";    
        String s2 = "javatpoint";    
        String s3 = "Javatpoint";  
        System.out.println(s1.equals(s2)); // True because content is same    
        if (s1.equals(s3)) {  
            System.out.println("both strings are equal");  
        }else System.out.println("both strings are unequal");     
    }  
}  
