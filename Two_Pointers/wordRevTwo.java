import java.util.Arrays;

/**
 * Reverses each word in the given string while preserving the original
 * word order. Multiple spaces between words are handled correctly by
 * splitting on one or more whitespace characters ("\\s+"), ensuring
 * no empty tokens are created. Each word is reversed using a two-pointer
 * technique on its character array. The reversed words are then joined
 * back into a single string using a StringBuilder and returned.
 *
 * Example:
 * Input : "This is a string"
 * Output: "sihT si a gnirts"
 */

public class wordRevTwo {
    public static void main(String[] args) {
        String s = "This is a string";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        // String[] arr = s.split(" "); Mistake : Fails at multiple spaces
        String[] arr = s.trim().split("\\s+");
        String str = "";
        for (int k = 0; k < arr.length; k++) {
            char[] tst = arr[k].toCharArray();
            int i = 0, j = tst.length - 1;
            while (i < j) {
                char temp = tst[i];
                tst[i] = tst[j];
                tst[j] = temp;
                // arr[k] = new String(tst); inefficient and redundant placement
                i++;
                j--;
            }

            arr[k] = new String(tst);
        }
        StringBuilder sb = new StringBuilder();
        for (String word : arr) {
            sb.append(word).append(" ");
        }
        String result = sb.toString().trim();
        // arr[k] = new StringBuilder(arr[k]).reverse().toString(); Ultra High level
        // approach to remove 2 pointers
        return result;

    }

}
