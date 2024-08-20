public class invertedhalfpyramid {

    public static void main(String[] args) {
        
        int n=4;
for(int i =1 ; i<= n; i++){

    //spaces
    for(int j=1; j<=i-1; j++){
        System.out.print(" ");
    }

    //number
    for(int j=n; j>=i ;j--){
        System.out.print(i + " ");
    }

    System.out.println();
}

    }
    
}
