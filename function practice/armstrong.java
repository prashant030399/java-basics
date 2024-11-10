import java.util.Scanner;
 
class Armstrong {

public String armstrong(int n){

int digit, sum =0 ;
int i =n;

while(n != 0){
    digit = n%10;
    sum = sum + (digit * digit * digit);
n = n/10;
}

if(i == sum){
    return i + " is a palindrome number";
} else {
    return i + " is not a palindrome number";
} 

}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
Armstrong x = new Armstrong();
String  result = x.armstrong(n);
System.out.print(result);
}

}

