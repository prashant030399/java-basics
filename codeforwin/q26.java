import java.util.*;
public class q26{
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a no:");
int n = sc.nextInt();
int c=0;

for(int i=1; i<=n ; i++){
    if(n%i==0){
        c++;
    }
}
if(c==2){
    System.out.print(n + " is a prime no.  ");
}
else {
    System.out.print(n + " is not a prime no.");
}


    }
} 