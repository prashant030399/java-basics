import java.util.Scanner;
 
class Perfect {

public String perfect(int n){

    int n1=n, sum =0;
for(int i=1 ; i<n ; i++){
    if(n%i ==0){
        sum = sum + i;
    }
}
if(n1 == sum){
    return n1 + " is a perfect number";
}else {
    return n1 + " is not a perfect number";
}

}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
Perfect x = new Perfect();
String  result = x.perfect(n);
System.out.print(result);
}

}

