import java.util.Arrays;

class Practice1 {

    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0) {
                return digits;
            }
        }

        digits = new int[n + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] plusOne = {1, 2, 3};
        Practice1 x = new Practice1();
        int[] result = x.plusOne(plusOne);
        System.out.println(Arrays.toString(result));
    }
}
