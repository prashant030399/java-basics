import java.util.*;
public class q18practice {

    public static void main(String [] args) {
 Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

int  base =10;
int freq[] = new int [base];

for(int i=0; i<base ; i++ ){
    freq[i] =0;
}

while(n!=0){
 int l = n%10;
 n=n/10;
  freq[l] ++;
}

for(int i=0; i<base ; i++ ){
    if(freq[i]>0){
    System.out.println(i +"-" + freq[i]);
 
    }
}





    }
}
