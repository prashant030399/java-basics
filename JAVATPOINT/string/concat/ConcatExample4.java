//Java String concat() Method Example 4
//Till now, we have seen that the concat() method appends the string at the end of the string that invokes the method. However, we can do a bit of workaround to append the string at the beginning of a string using the concat() method.
// A Java program that shows how to add   
// a string at the beginning of another string  
public class ConcatExample4  
{  
// main method  
public static void main(String argvs[])  
{  
String str = "Country";  
  
// we have added the string "India is my" before the String str;  
// Also, observe that a string literal can also invoke the concat() method  
String s = "India is my ".concat(str);  
  
// displaying the string  
System.out.println(s);  
  
}  
}  


