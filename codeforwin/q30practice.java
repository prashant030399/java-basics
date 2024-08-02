import java.util.*;
public class q30practice {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a no:");
    int n = sc.nextInt();
int sum =0;
int originaln =n;
while(n!=0){
int digits = n%10;
sum = sum + (digits * digits * digits);
n=n/10;
}

if(sum == originaln){
    System.out.print(originaln + " is an armstrong no."  );
}
else {
    System.out.println(originaln + " is not an armstrong no.");
}
}    
}


    


