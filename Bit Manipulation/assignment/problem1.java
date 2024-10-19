//1. Write a program to find if a number is a power of 2 or not.

import java.util.*;

public class problem1 {

    public static void main(String args []){

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        if((n&(n-1))==0){
System.out.print(n+" is a power of 2");
        } else {
            System.out.print(n+" is not a power of 2");
        }



    }
    
}
