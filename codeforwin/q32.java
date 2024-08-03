import java.util.*;

public class q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   System.out.print("Enter a number:");
        int n = sc.nextInt();

        int orn; int  sum=0 ; int i;
orn =n;

for( i=1; i<=n-1 ; i++ ){
if(n%i==0){
    sum = sum + i;
}
}

if(sum == orn){
    System.out.print(n + " is a perfect no.");
}
else {
    System.out.print(n + " is not a perfect no.");
}


        }

    }