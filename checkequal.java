import java.util.Scanner;

public class checkequal {
    

    public static void main( String [] args)
    {


                Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int b= sc.nextInt();

        if(a==b)
        {
            System.out.print("both are equal");
        }

        else if(a>b)
        {
System.out.print("a is greater");

        }

        else if(b>a)
        {

            System.out.print("b is greater");
        }






    }
}
