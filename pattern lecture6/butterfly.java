        public class butterfly{
 public static void main(String [] args){

      
    int n=4;

      // upper half
    for(int i=1; i<=n; i++){
        
        //1st star
        for(int j=1 ; j<=i ; j++){
System.out.print("x");  
        }

             //spaces
             for(int j=1 ; j<=2*(n-i) ; j++){
                System.out.print(" ");
                        }

                              //2nd star
        for(int j=1 ; j<=i ; j++){
            System.out.print("x");
                    }

System.out.println();

    }

     // lower half
     for(int i=n; i>=1; i--){
        
        //1st star
        for(int j=1 ; j<=i ; j++){
System.out.print("x");  
        }

             //spaces
             for(int j=1 ; j<=2*(n-i) ; j++){
                System.out.print(" ");
                        }

                              //2nd star
        for(int j=1 ; j<=i ; j++){
            System.out.print("x");
                    }

System.out.println();

    }
}
}