//Java String contains() Method Example 3
//The contains() method is helpful to find a char-sequence in the string. We can use it in the control structure to produce the search-based result. Let's see an example.

public class ContainsExample3 {   
    public static void main(String[] args) {          
        String str = "To learn Java visit Javatpoint.com";        
        if(str.contains("Javatpoint.com")) {  
            System.out.println("This string contains javatpoint.com");  
        }else  
            System.out.println("Result not found");       
    }  
}  
