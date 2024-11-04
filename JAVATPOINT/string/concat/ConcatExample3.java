//Java String concat() Method Example 3
//Let's see an example where we are concatenating spaces and special chars to the string object. It is done using the chaining of the concat() method.

public class ConcatExample3 {  
    public static void main(String[] args) {  
        String str1 = "Hello";  
        String str2 = "Javatpoint";  
        String str3 = "Reader";  
        // Concatenating Space among strings  
        String str4 = str1.concat(" ").concat(str2).concat(" ").concat(str3);  
        System.out.println(str4);         
        // Concatenating Special Chars        
        String str5 = str1.concat("!!!");  
        System.out.println(str5);         
        String str6 = str1.concat("@").concat(str2);  
        System.out.println(str6);  
    }  
}  
