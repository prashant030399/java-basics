import java.util.Scanner;
 
class Strong {

public String strong(int n){
int digit , sum =0;
int n1 = n;

while(n != 0){
digit = n%10;
int f=1;
for(int i=digit ; i>=1 ; i--){
    f = f*i;
}
sum = sum + f;
n = n/10;
}

if(sum == n1){
    return n1 + " is a strong number";
} else{
    return n1 + " is not a strong number";
}

}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
Strong x = new Strong();
String  result = x.strong(n);
System.out.print(result);
}

}

