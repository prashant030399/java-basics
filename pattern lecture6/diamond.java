public class diamond {


    public static void main(String [] args){
   
         
        int n=4;

 // first half
 for(int i = 1 ; i<=n; i++){
     
     //spaces
     for(int j=1 ;j<=n-i ; j++){
 System.out.print(" ");
     }
 
 //stars
 for(int j =1 ; j<=2*i-1; j++){
     System.out.print("x");
 }

 System.out.println();
 }


//second half 

for(int i = n ; i>=1; i--){
     
     //spaces
     for(int j=1 ;j<=n-i ; j++){
 System.out.print(" ");
     }
 
 //stars
 for(int j =1 ; j<=2*i-1; j++){
     System.out.print("x");
 }

 System.out.println();
 }

}


 
}
    

