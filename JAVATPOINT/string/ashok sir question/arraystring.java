import java.util.Arrays;

public class arraystring {
    
    public static void main(String[] args) {

        String x = "Ashok";
        String y = "hsAok";

char [] c = x.toCharArray();
char [] d = y.toCharArray();

Arrays.sort(c);
Arrays.sort(d);

x = new String(c);
y = new String(d);

if(x.equals(y)){
    System.out.print("Anagram");
} else {
    System.out.print("Not anagram");
}

    }
}
