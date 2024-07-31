import java.util.*;

public class q21 {

    public static void main(String [] args ){
Scanner sc =new Scanner(System.in);

int  base = sc.nextInt();
int expo = sc.nextInt();
int power =1;

for(int i=1; i<=expo; i++){
    power = power * base;
}
System.out.print(power);






    }
    
}
