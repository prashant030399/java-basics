//Java String endsWith() Method Example 5
//The endsWith() method raises the NullPointerException if one passes null in the parameter of the method. The following example shows the same.

public class EndsWithExample5  
{  
// main method  
public static void main(String argvs[])  
{  
String str = "Welcome to JavaTpoint!";  
  
// invoking the method endsWith with the parameter as null  
if(str.endsWith(null))  
{  
System.out.println("Inside the if block");  
}  
else  
{  
System.out.println("Inside the else block");  
}  
  
}  
}  

