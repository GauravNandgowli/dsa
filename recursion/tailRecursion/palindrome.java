package tailRecursion;

public class palindrome {

    public static void main(String[] args) {
        System.out.println();
        int[] arr = { 1, 2, 2, 1 };

        System.out.println(checkPalin(arr));
    }

    public static boolean checkPalin(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        return helper(arr, start, end);

    }

    public static boolean helper(int[] arr, int start, int end) {

        if (start > end)
            return true;
        if (arr[start] != arr[end])
            return false;
        start++;
        end--;
        return helper(arr, start, end);
    }
}
