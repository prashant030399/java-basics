//Java String format() Method Example 3
//Apart from formatting, we can set width, padding etc. of any value. Let us see an example where we are setting width and padding for an integer value.

public class FormatExample3 {  
    public static void main(String[] args) {          
        String str1 = String.format("%d", 101);  
        String str2 = String.format("|%10d|", 101);  // Specifying length of integer  
        String str3 = String.format("|%-10d|", 101); // Left-justifying within the specified width  
        String str4 = String.format("|% d|", 101);   
        String str5 = String.format("|%010d|", 101); // Filling with zeroes  
        System.out.println(str1);  
        System.out.println(str2);  
        System.out.println(str3);  
        System.out.println(str4);  
        System.out.println(str5);  
    }  
}  

