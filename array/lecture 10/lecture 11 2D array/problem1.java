//Take a matrix as input from the user . Search for a given number x 
//   AND  print the indices at which it occurs.
import java.util.*;

public class problem1 {

    public static void main(String args []){
Scanner sc = new Scanner(System.in);

System.out.print("Enter rows: ");
int rows = sc.nextInt();

System.out.print("Enter columns: ");
int cols = sc.nextInt();

int [][] numbers = new int [rows][cols];

//input
//rows
for(int i=0 ; i<rows ; i++){
//columns
    for(int j=0 ; j<cols ; j++){
        numbers[i][j] = sc.nextInt();
    }
}

//Enter number x to find its index
System.out.print("Enter x to find its index ");
int x = sc.nextInt();


for(int i=0 ; i<rows ; i++){
    for(int j=0 ; j<cols ; j++){

        //compare with x
if(x == numbers[i][j]){
    System.out.print("x found at index (" +i + "," + j + ")");
}


    }
}

    }
    
}
