// 2. Write a program to toggle a bit a position = “pos” in a number “n”.
import java.util.*;

public class problem2 {
  
    public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);
int n= sc.nextInt();
int pos = sc.nextInt();

int bitmask = 1 << pos;

int newnumber = n ^ bitmask;
System.out.print(newnumber);


    }

}
