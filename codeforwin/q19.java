import java.util.*;

public class q19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
int revn = 0 ;
while(n !=0){
revn = (revn * 10) +  n % 10;
n = n/10;    
}

while(revn!= 0) {
switch(revn % 10)
{
case 0:
System.out.println("zero");
break;
case 1:
System.out.println("one");
break;
case 2:
System.out.println("two");
break;
case 3:
System.out.println("three");
break;

case 4:
System.out.println("four");
break;

case 5:
System.out.println("five");
break;
case 6:
System.out.println("six");
break;
case 7:
System.out.println("seven");
break;
case 8:
System.out.println("eight");
break;

case 9:
System.out.println("nine");
break;

}
revn = revn/10;
}

    }
}
