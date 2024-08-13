public class f2 {
    public static void main(String[] args) {
int n=5;
        for(int i=1; i<=5 ;i++){
            for(int j=5; j>=i ; j--)     {
                if(i%2==0){
                    System.out.print("0");
                }
                else if(i%2==1){
                    System.out.print("1");
                }
              
            }
            System.out.println();
        }
        
    }
    
}

