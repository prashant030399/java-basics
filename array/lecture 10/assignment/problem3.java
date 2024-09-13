//Take an array of numbers as input and check if it is an array sorted in ascending order.

import java.util.*;

public class problem3 {

    public static void main(String args []){

    Scanner sc = new Scanner (System.in);
    System.out.print("Enter  size:");
       int size = sc.nextInt();
      int number [] = new int [size];
       
       for(int i=0; i<size ; i++){
     number[i] = sc.nextInt();
       }

       boolean isAscending = true;

       for(int i=0; i<number.length -1 ; i++){
        if(number[i]> number[i+1]){
          isAscending = false;
        }
       }

if(isAscending){
  System.out.print("This is array is sorted in Ascending Order");
}    
else {
  System.out.print("This array is not sorted in Ascending Order");
}

    }
    
}
