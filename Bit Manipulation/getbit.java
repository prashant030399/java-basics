import java.util.*;

public class getbit{
public static void main(String[] args) {
    
int n =5;  //0101
int pos = 3;
int bitmask = 1<<pos;

if((bitmask & n) == 0){               
    System.out.print("bit was zero");
} else {
System.out.print("bit was one ");
}

}

}