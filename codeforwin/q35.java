import java.util.*;
public class q35{
public static void main( String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a no. until which  u want to find a strong no. ");
int end = sc.nextInt();

   

for( int i=1 ; i<=end ; i++  ){
int  orn =i;
int sum =0;

    while(orn!=0){
int    digit = orn%10;
 int f=1;

 for(int j=digit ; j>=1 ; j-- ){
f= f*j;
 }
sum = sum + f;
orn= orn/10;
    }
    if(sum == i){
        System.out.println(i+ " is a strong number ");
    }
}
sc.close();

}

}
