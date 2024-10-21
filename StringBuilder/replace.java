public class replace {

    public static void main (String args []){

StringBuilder sb = new StringBuilder("The quick brown fox jumps over the lazy dog");
sb.replace(10, 15, "black");

System.out.print(sb.toString());


    }
    
}
