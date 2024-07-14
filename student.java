import java.util.Scanner;

public class student {


    public static void  main   (String [] args   )
    {

         Scanner sc = new Scanner(System.in);

int m1 = sc.nextInt();
int m2 = sc.nextInt();
int m3 = sc.nextInt();

int total = m1 + m2 + m3;

int per = total/3;

System.out.println(total);

System.out.println(per);



    }
    
}
