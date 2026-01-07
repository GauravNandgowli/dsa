public class revSeg2 {
    public static void main(String[] args) {
        String s = "abcdefgh";
        // String s = "abcdefghij";
        // String s = "abcdefghijk";
        int k = 3;
        System.out.print(revSeg(s, k));
    }

    public static String revSeg(String str, int k) {
        char[] arr = str.trim().toCharArray();
        int i = 0;
        int j = k - 1;

        if (arr.length <= k) {
            swap(arr, i, arr.length - 1);
            return new String(arr);

        }

        while (i < j) {
            swap(arr, i, j);
            i = j + k + 1;
            j = Math.min((i + k - 1), arr.length - 1);

        }
        return new String(arr);
    }

    public static void swap(char[] arr, int i, int j) {
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
