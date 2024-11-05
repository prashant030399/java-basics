
//Java String endsWith() Method Example 3
//The endsWith() method takes care of the case sensitiveness of the characters present in a string. The following program shows the same.
public class EndsWithExample3   
{    
// main method  
public static void main(String argvs[])   
{  
String str = "Welcome to JavaTpoint";  
  
// the result of the following display statement  
// shows endsWith() considers the case sensitiveness of   
// the charaters of a string  
System.out.println(str.endsWith("javaTpoint")); // false because J and j are different  
System.out.println(str.endsWith("Javatpoint")); // false because T and t are different  
System.out.println(str.endsWith("JavaTpoint")); // true because every character is same  
  
}  
}  
