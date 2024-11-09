import java.util.Scanner;

class Greatestof3 {

    public String  greatestof3(int n1, int n2, int n3){
        if(n1>n2 && n1>n3){
            return n1 + " is greatest";
        } else if(n2>n1 && n2>n3){
            return n2 + " is greatest";
        } else if(n3>n1 && n3>n2){
            return n3 + " is greatest";
        } else {
            return "All are equal";
        }
    }

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
int n3 = sc.nextInt();
Greatestof3 x  = new Greatestof3();
String result = x.greatestof3(n1,n2,n3);
System.out.print(result);

}
}