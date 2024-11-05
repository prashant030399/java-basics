//Java String endsWith() Method Example 6
//A String literal can also call the endsWith() method. The following program shows the same.
	


public class EndsWithExample6  
{  
// main method  
public static void main(String argvs[])  
{  
// invoking the method endsWith() using the string literal  
if("Welcome to JavaTpoint".endsWith(""))  
{  
System.out.println("Inside the if block");  
}  
else  
{  
System.out.println("Inside the else block");  
}  
// invoking the method endsWith() using the string literal  
if("Welcome to JavaTpoint".endsWith("point"))  
{  
System.out.println("Inside the if block");  
}  
else  
{  
System.out.println("Inside the else block");  
}  
// invoking the method endsWith() using the string literal  
if("Welcome to JavaTpoint".endsWith("xyz"))  
{  
System.out.println("Inside the if block");  
}  
else  
{  
System.out.println("Inside the else block");  
}  
}  
}  

