import java.util.*;
public class q33 {
    public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
System.out.print("Enter end no:");

 int end  = sc.nextInt();
 int i; int j;   int orn; 

 
 for(i=1 ; i<=end ; i++ ){

    int sum =0;
    for(j=1; j<=i-1 ; j++ ){
        if(i%j==0){
            sum = sum + j;
        }
    }

   if(sum == i){
    System.out.println(i);
   }
    
 }

    }


    
}
