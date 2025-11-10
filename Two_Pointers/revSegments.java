public class revSegments {
    public static void main(String[] args) {
        String s = "abcd";
        int k = 5;
        System.out.print(revSeg(s, k));
    }

    public static String revSeg(String str, int k) {

        char[] arr = str.trim().toCharArray();

        int start = 0;
        int end = Math.min((2 * k - 1), arr.length - 1);
        while (start < arr.length) {
            System.out.println(start);
            System.out.println(end);
            swap(arr, start, Math.min((start + k - 1), arr.length - 1));
            start = end + 1;
            end = start + 2 * k - 1;
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