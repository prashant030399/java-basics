//1 Take an array of Strings input from the user & find the cumulative (combined)
// length of all those strings.


import java.util.*;

public class problem1 {

    public static  void main (String args []){

        Scanner sc = new Scanner(System.in) ;
        int  size = sc.nextInt();
  
        String arrayOfStrings  [] = new String [size];
        int totalLength =0;


for(int i=0; i<size ; i++){
    arrayOfStrings [i] = sc.next();
    totalLength = totalLength + arrayOfStrings[i].length();
}

System.out.print(totalLength);


    }
    
}
