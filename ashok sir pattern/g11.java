public class g11 {
    public static void main(String[] args) {
int n = 4;                             
        for(int i=4; i>=1 ;i--){
            for(int j=1; j<=i ; j++)     {
              System.out.print(" ");
            }
for(int j=0 ; j<=n-i; j++) {
    System.out.print("x");
}
            System.out.println();
   
        }
        
    }
    
}