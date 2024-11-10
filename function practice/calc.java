import java.util.*;

 class Calc {
    
   public int add(int n1, int n2){
    return n1 + n2;
   }

   public int sub(int n1, int n2){
return n1 - n2 ;
   }

   public int mul(int n1, int n2){
    return n1*n2 ;
   }
   
   public int div(int n1, int n2){
    return n1/n2 ;
   }
  

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
Calc x = new Calc();

int resultadd = x.add(n1,n2);
System.out.println(resultadd);

int resultsub = x.sub(n1,n2);
System.out.println(resultsub);

int resultmul = x.mul(n1,n2);
System.out.println(resultmul);

int resultdiv = x.div(n1,n2);
System.out.println(resultdiv);



}
}
