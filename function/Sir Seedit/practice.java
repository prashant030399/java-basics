import java.util.*;

class Practice {

int factorial(int a ){
int f=1;
for(int i=a ; i>=1 ; i--){
    f =f*i;
}
return f;
    }
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
Practice x = new Practice();
int x1 = x.factorial(a);
System.out.print(x1);

    }
}





