import java.util.*;

public class updatebit{

    public static void main(String[] args) {
    
Scanner sc = new Scanner (System.in);
int operation = sc.nextInt();
//operation=1 -> set     operation=0 -> clear        
int n=5;
int pos = 1;

if(operation == 1){
  //set
    int bitmask = 1<< pos ;
  int newnumber = bitmask | n;
  System.out.print(newnumber);
  
}
else{
    //clear 
    int bitmask = 1 << pos ;
int newbitmask = ~(bitmask);
int newnumber = newbitmask & n;
System.out.print(newnumber);
}


    }}