import java.util.*;

public class q28{
public static void main(String[] args){
    
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();

    int i; int  j;
 int isprime; int sum =0;

    for(i=2; i<=n ;i++ ){
        isprime =1;
for(j=2; j<=i/2  ; j++){
    if(i%j==0)  
    {
        isprime =0;
        break;
    }
}
if(isprime==1){ 
sum = sum +i;   
}
// System.out.print(sum);
    } 
    System.out.print(sum);
}    
}
