import java.util.Scanner;
 
class Palindrome {

public String palindrome(int n){
int rev =0;
int n1 = n;
while(n != 0){
    rev = (rev*10)+ (n%10);
    n=n/10;
}
if(rev == n1){
    return n1 + " is palindrome number ";
}else{
    return n1 + " is not palindrome number ";
}
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
Palindrome x = new Palindrome();
String  result = x.palindrome(n);
System.out.print(result);
}

}
