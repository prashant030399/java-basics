// Find the maximum and minimum number in an array of integer  

import java.util.*;

public class problem2_1 {

public static void main(String args []){
Scanner sc  = new Scanner(System.in);

System.out.print("Enter size:");
int size = sc.nextInt();

int number[] = new int[size];

// taking an input
for(int i= 0 ; i<size ; i++){
    number [i]= sc.nextInt();
}


int max =0; int min = number[0];     /// u ve to take this value here only


for(int i=0 ; i<number.length; i++){

    if(number[i]> max){
        max = number[i];
    }

    if(number[i]<min){
min = number[i];
    }

}

System.out.println("Largest number is :" + max);
System.out.print("Smallest number is :" + min);

    }
    
}
