//For a given matrix of N x M, print its transpose.
import java.util.*;
public class problem2 {

     public static void main(String args []){
Scanner sc =  new Scanner (System.in);

System.out.print("Enter Rows: ");
int rows = sc.nextInt();

System.out.print("Enter Column: ");
int cols = sc.nextInt();

int [][] matrix = new int [rows][cols];

for(int i=0 ; i<rows  ; i++){
    for(int j=0 ; j<cols ; j++){
        matrix[i][j] = sc.nextInt();
    }
}

System.out.println("The Transpose is: ");

//Printing the transpose
for(int j=0 ; j<cols ;j++){
    for(int i=0; i<rows ; i++){
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
} 



    }
    
}
