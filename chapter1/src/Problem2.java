import java.util.Arrays;

public class Problem2 {

    private static boolean isRearrangeCharacter(String one, String another) {
        if (one.length() != another.length()) {
            return false;
        }

        return sort(one).equals(sort(another));
    }

    private static String sort(String target) {
        char[] sorted = target.toCharArray();
        Arrays.sort(sorted);
        return new String(sorted);
    }

    public static void main(String[] args) {
        String one = "apple";
        String another = "elppa";
        System.out.println(one + " is arranged " + another + " ? " + isRearrangeCharacter(one, another));

        another = "not arranged";
        System.out.println(one + " is arranged " + another + " ? " + isRearrangeCharacter(one, another));

        another = "different character length";
        System.out.println(one + " is arranged " + another + " ? " + isRearrangeCharacter(one, another));

        one = "vuejs";
        another = "jsvue";
        System.out.println(one + " is arranged " + another + " ? " + isRearrangeCharacter(one, another));
    }
}
