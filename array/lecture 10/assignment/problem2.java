// Find the maximum and minimum number in an array of integer  

public class problem2 {

    public static void main(String args []){

        int x [] = {1,2,3,4,5,6,7,8,9,10};
int max = 0; int  min = x[0];

for(int i=0; i<x.length ; i++){
    
    if(x[i]>max){
        max = x[i];
    } 
  
if(x[i]<min){
    min = x[i];
}

}

System.out.println(max);
System.out.println(min);

    } 
    
}
