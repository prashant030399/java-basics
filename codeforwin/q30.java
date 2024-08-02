import java.util.*;

public class q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
int sum =0;
int originalno =n;
while(n!=0){
int digit=n%10;
sum = sum + (digit * digit * digit);
n= n/10;

}

if(sum==originalno){
    System.out.print(originalno + " is an armstrong no"  );
}
else{
    System.out.print(originalno + " is not an armstrong no");
}
        
    }
} 


