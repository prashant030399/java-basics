import java.util.*;

class Greatestof3 {

void greatestof3(int a, int b, int c){

    if(a>b && a>c){
        System.out.print("a is greatest");
    }
    else if(b>c && b>a){
        System.out.print("b is greatest");
    }
    else {
        System.out.print("c is greatest");
    }
 }

public static void main (String args []){

Scanner sc = new Scanner (System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();

Greatestof3 x = new Greatestof3();
x.greatestof3(a,b,c);


}
}
