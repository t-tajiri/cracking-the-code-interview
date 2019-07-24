public class Main {
    private static final int ASCII_CODE_LENGTH = 128;

    private static boolean isUniqueCharacter(String str) {
        if(str.length() > ASCII_CODE_LENGTH) {
            return false;
        }

        var used = new boolean[ASCII_CODE_LENGTH];
        for(int i = 0; i < str.length(); i++) {
            var target = str.charAt(i);

            if(used[target]) {
                return false;
            }

            used[target] = true;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "main";
        System.out.println(str + " is duplicated character? : " + isUniqueCharacter(str));

        String duplicate = "testDuplicate";
        System.out.println(duplicate + " is duplicated character? : " + isUniqueCharacter(duplicate));
    }
}
