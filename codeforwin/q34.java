import java.util.*;
public class q34{
public static void main( String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a no. to find whether it is strong no. or not ");

int n = sc.nextInt();

int digit, sum=0; 
int orn =n;

while(n!=0){
digit = n%10;

int f=1;
for(int i=digit; i>=1; i--){
f= f*i;
}
sum = sum + f;
n=n/10;
}

if(sum == orn){
    System.out.print(orn + " is a strong no.");
}
else {
    System.out.print(orn + " is not a strong no.");
}


}

}
