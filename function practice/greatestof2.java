import java.util.*;

class Greatestof2 {

    public String  greatestof2(int n1, int n2){
if(n1 >n2){
    return n1 + " is greatest";
} else if(n2 > n1){
    return n2 + " is greatest";
} else {
    return "Both are equal";
}
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
Greatestof2 x = new Greatestof2();
String  result = x.greatestof2(n1,n2);
System.out.print(result);

    }
    
}
