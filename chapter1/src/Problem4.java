import java.util.BitSet;

public class Problem4 {

    private static boolean isPalindrome(String text) {
        char[] chars = text.toCharArray();
        BitSet bs = new BitSet();

        // find odds number of character
        for(char c : chars) {
            int index = c - 'a';
            bs.flip(index);
        }

        return bs.cardinality() % 2 != 0;
    }

    public static void main(String[] args) {
        String text = "aapplee";

        System.out.println(text + " is palindrome ? " + isPalindrome(text));
    }
}
