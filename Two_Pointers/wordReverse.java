public class wordReverse {

    public static void main(String[] args) {
        String s = "This is a string";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = 0;

        while (i < arr.length) {

            while (i < arr.length && !isCharacter(arr[i]))
                i++;
            while (j < arr.length && isCharacter(arr[j]))
                j++;

            wordSwap(arr, i, j);
            i = j + 1;
            j++;

        }
        return new String(arr);
    }

    public static void wordSwap(char[] arr, int i, int j) {
        j = j - 1;
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static boolean isCharacter(char c) {
        return Character.isLetter(c);
    }

}
