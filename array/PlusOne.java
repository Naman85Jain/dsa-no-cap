public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {4, 3, 2, 1};

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 != 10) {
                digits[i] += 1;
                return;
            }
            digits[i] = 0;
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return;
    }
}
