import java.util.*;

class Practice2add {

public int add(int n1, int n2){
return n1 + n2;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n1 = sc.nextInt();
int n2 = sc.nextInt();
Practice2add x = new Practice2add();
int result = x.add(n1,n2);
System.out.print(result);

}

}