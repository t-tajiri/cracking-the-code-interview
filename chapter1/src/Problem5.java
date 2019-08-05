public class Problem5 {
    // my chose is brute force, so gotta be better it
    private static boolean isReplaceOnlyOneManipulation(String one, String another) {
        if (one.length() == another.length()) {
            return isEditOnlyOne(one, another);
        } else if (one.length() > another.length()) {
            return isInsertOrDeleteOnlyOne(one, another);
        } else {
            return isInsertOrDeleteOnlyOne(another, one);
        }
    }

    private static boolean isEditOnlyOne(String first, String second) {
        boolean twoDifferences = false;
        for(int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                if (twoDifferences) {
                    return false;
                }

                twoDifferences = true;
            }
        }

        return true;
    }

    private static boolean isInsertOrDeleteOnlyOne(String longer, String shorter) {
        boolean twoDifferences = false;
        int longerIndex = 0;
        int shorterIndex = 0;

        while(longerIndex < longer.length() && shorterIndex < shorter.length()) {
            if (longer.charAt(longerIndex) != shorter.charAt(shorterIndex)) {
                if (twoDifferences) {
                    return false;
                }

                twoDifferences = true;
                shorterIndex += 2;
            } else {
                longerIndex++;
                shorterIndex++;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String one;
        String another;

        one     = "pale";
        another = "pales";
        System.out.println(one + " can replace " + another + " by only one manipulation ? " + isReplaceOnlyOneManipulation(one, another));

        one     = "pale";
        another = "bake";
        System.out.println(one + " can replace " + another + " by only one manipulation ? " + isReplaceOnlyOneManipulation(one, another));

        one     = "pale";
        another = "pal";
        System.out.println(one + " can replace " + another + " by only one manipulation ? " + isReplaceOnlyOneManipulation(one, another));

        one     = "apple";
        another = "aple";
        System.out.println(one + " can replace " + another + " by only one manipulation ? " + isReplaceOnlyOneManipulation(one, another));

    }
}
