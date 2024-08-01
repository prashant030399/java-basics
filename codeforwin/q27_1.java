import java.util.*;

public class q27_1 {
public static void main(String[] args){
    
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();

    int i; int  j;
 int isprime;

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
    System.out.println(i);
}

    } 
}    
}
