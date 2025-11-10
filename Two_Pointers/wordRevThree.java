public class wordRevThree {

    /*
     * “Move through the string character by character.
     * Whenever I
     * hit a word,
     * reverse just
     * that word.
     * Skip spaces and continue.”
     */

    public static void main(String[] args) {
        String s = "This is           a string";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        char[] arr = s.trim().toCharArray();
        int spaceFinder = 0;
        int i = 0, j = 0;
        while (spaceFinder < arr.length) {
            while (spaceFinder < arr.length && !isSpace(arr[spaceFinder])) {
                spaceFinder++;
            }

            wordSwap(arr, i, spaceFinder - 1);

            i = spaceFinder;
            while (i < arr.length && isSpace(arr[i])) {
                i++;
            }
            spaceFinder = i;
        }
        return new String(arr);

    }

    public static void wordSwap(char[] arr, int i, int j) {
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static boolean isSpace(char c) {
        return c == ' ';
    }

}
