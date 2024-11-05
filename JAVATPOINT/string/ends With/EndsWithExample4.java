//Java String endsWith() Method Example 4
//When an empty string is passed in the parameter of the method endsWith(), the method always returns a true value. The reason behind this is that a string never changes when we append an empty string to it. For example,
public class EndsWithExample4  
{    
// main method  
public static void main(String argvs[])   
{  
String str = "Welcome to JavaTpoint";  
  
// prints true  
System.out.println(str.endsWith(""));  
  
// prints false as there is no white space after the string  
System.out.println(str.endsWith(" "));  
  
}  
}  

