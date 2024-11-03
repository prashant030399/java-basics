
//Java String compareTo(): ClassCastException
//The ClassCastException is thrown when objects of incompatible types get compared. In the following example, we are comparing an object of the ArrayList (al) with a string literal ("Sehwag").

// import statement  
import java.util.*;  
  
class Players   
{  
       
private String name;  
  
// constructor of the class  
public Players(String str)  
{  
name = str;  
}  
   
}  
  
public class CompareToExample4  
{  
   
// main method  
public static void main(String[] args)   
{  
   
Players ronaldo = new Players("Ronaldo");  
Players sachin = new Players("Sachin");  
Players messi = new Players("Messi");  
ArrayList<Players> al = new ArrayList<>();  
  
al.add(ronaldo);  
al.add(sachin);  
al.add(messi);  
   
// performing binary search on the list al  
Collections.binarySearch(al, "Sehwag", null);  
}  
       
}  
