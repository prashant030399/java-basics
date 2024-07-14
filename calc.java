import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class calc {

    public static void main ( String [] args  )
    {
     Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int b = sc.nextInt();

        int button = sc.nextInt();

        if(button ==1){
System.out.println(a+b);
        } else if (button ==2){
            System.out.println(a-b);
        } else if(button ==3){
System.out.println(a*b);
        } else if(button ==4){
        System.out.println(a/b);
        }else {
            System.out.println("Invalid button");
        }
    }
    
}
