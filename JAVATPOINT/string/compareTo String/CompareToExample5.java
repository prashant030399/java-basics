//Java String compareTo(): NullPointerException
//The NullPointerException is thrown when a null object invokes the compareTo() method. Observe the following example.

public class CompareToExample5  
{  
// main method  
public static void main(String[] args)   
{  
   
String str = null;  
  
// null is invoking the compareTo method. Hence, the NullPointerException  
// will be raised  
int no =  str.compareTo("India is my country.");  
  
System.out.println(no);  
}  
}  
