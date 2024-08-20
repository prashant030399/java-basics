import java.util.*;

public class hollowbutterfly{

    public static void main(String args[]) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter the number of row:");


int n = sc.nextInt();

//upper part
        for(int i=1; i<=n; i++) {

            //left wing of upper part 
        for(int j=1; j<=i; j++) {
if(j==1  || j==i){
    System.out.print("x");
}
else{
    System.out.print(" ");
}
        }

        // spaces
        for(int j=1 ; j<=2*(n-i); j++){
            System.out.print(" ");
        }

        //right wing of upper part 
        for(int j=1 ; j<=i ; j++){
           
if(j==1  || j==i){
    System.out.print("x");
}
else {
    System.out.print(" ");
}
        }
        System.out.println();
        }


        //lower part 
        for(int i=n ; i>=1 ;i-- ){

            //left wing of lower part
            for(int j=1 ; j<=i ;j++){
if(j==1 || j==i){
    System.out.print("x");
}
else{
    System.out.print(" ");
}

            }

//spaces
for(int j =1; j<=2*(n-i); j++){
    System.out.print(" ");
}

//right wing of lower part 
for(int j=1 ; j<=i ;j++){
    if(j == 1 || j == i){
        System.out.print("x");
    } else {
        System.out.print(" ");
    }
}


            System.out.println();
        }












        }


}