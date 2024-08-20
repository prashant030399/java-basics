import java.util.*;
public class hollowrhombus {
    public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of rows:");
      int n= sc.nextInt();

      for(int i =1 ; i<=n; i++){

        //spaces
        for( int  j=1 ; j<=n-i; j++){
            System.out.print(" ");
        }
 
for(int j=1 ; j<=n ;j++){

    //star
    if(i==1 || i==n || j==1  || j==n){
        System.out.print("x");
    }

    //inner spaces 
    else {
        System.out.print(" ");
    }

}

System.out.println();

      }

    }
    
}
