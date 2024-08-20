import java.util.*;

public class pascaltriangle{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row of Pascal's triangle: ");
        int row  = sc.nextInt();

        for(int  i=0; i<= row ; i++){

            //spaces 
            for(int  j=0; j<= row - i ; j++){
System.out.print(" ");
            }

            int number = 1;
            
            
            //number 
           for(int j=0; j<=i ; j++   ){
                System.out.print(number + " ");
                number = number  * (i-j)/ (j+1);  
            }

            System.out.println();

        }


    }
}