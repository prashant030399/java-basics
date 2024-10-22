//Counting frequency of a character in a string by using the charAt() method 

public class CharAtExampleCharAtCount {  
    public static void main(String[] args) {  
        String str = "Welcome to Javatpoint portal";          
     int count =0;
     for(int i=0; i<=str.length()-1; i++){
        if(str.charAt(i)=='t'){
            count ++;
        }
     }
        	System.out.print("Frequency of t is:" + count);
    }  
}  
