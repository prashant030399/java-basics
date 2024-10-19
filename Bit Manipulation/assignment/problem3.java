//3. Write a program to count the number of 1’s in a binary representation of the number.

import java.util.*;

public class problem3{

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
int countone =0;

    for(int i=0; i<32 ; i++){
        // Check if the least significant bit is 1
   if((n&1)==1){
    countone ++;
   }
   // Right-shift the number by 1 to check the next bit
   n = n >> 1;
    }

System.out.print(countone);

    }
}

