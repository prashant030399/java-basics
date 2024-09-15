import java.util.*;

public class charAt {

    public static void main(String args []){
Scanner sc = new Scanner(System.in);
String firstName = sc.next();
String lastName = sc.next();
String fullName = firstName + "@" + lastName;
for(int i=0 ; i<fullName.length() ; i++){
    System.out.println(fullName.charAt(i));
}


    } 
    
}
