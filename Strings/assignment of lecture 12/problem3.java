//3 Input an email from the user. You have to create a username from the email
//by deleting the part that comes after ‘@’. Display that username to the user.
//Example :
//email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”

import java.util.*;

public class problem3 {
    
    public static void main (String args []){

Scanner sc =new Scanner(System.in);
String email = sc.next();
String username = "";

for(int i=0 ; i<email.length() ; i++){
if(email.charAt(i)  == '@'){
    break;  
} else {
    username += email.charAt(i);
} 

}
System.out.print("Username - "+username );



    }
}
