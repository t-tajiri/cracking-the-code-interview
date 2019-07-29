public class Problem3 {
    private static String urlify(char[] str, int length) {
        int spaceCount = 0;

        for (int i = 0; i < length; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }

        int index = length + spaceCount * 2;
        char[] result = new char[index];

        for(int i = length - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                result[index - 3] = '%';
                result[index - 2] = '2';
                result[index - 1] = '0';
                index = index - 3;
            } else {
                result[index - 1] = str[i];
                index--;
            }
        }
        return String.valueOf(result);
    }
    public static void main(String args[]) {
        String text = "Mr John Smith ";
        System.out.println(urlify(text.toCharArray(), 13));
    }
}
