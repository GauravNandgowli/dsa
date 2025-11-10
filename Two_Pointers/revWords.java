public class revWords {
    public static void main(String[] args) {
        String s = "This is a          string";
        System.out.println(reverseWords(s));
    }
    // string a is This

    public static String reverseWords(String s) {
        char[] arr = s.trim().toCharArray();
        int i = 0, j = 0;
        int spaceFinder = 0;
        rev(arr, i, arr.length - 1);

        while (i < arr.length) {

            while (spaceFinder < arr.length && !isSpace(arr[spaceFinder])) {
                spaceFinder++;
            }
            rev(arr, i, spaceFinder - 1);
            i = spaceFinder;
            while (i < arr.length && isSpace(arr[i])) {
                i++;
            }
            spaceFinder = i;

        }

        return new String(arr).replaceAll("\\s+", " ");
    }

    public static void rev(char[] arr, int i, int j) {
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
