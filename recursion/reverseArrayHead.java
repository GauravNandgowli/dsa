public class reverseArrayHead {
    public static void main(String[] args) {
        System.out.println();
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] res = rev(arr);
        for (int i : res) {
            System.out.println(i);
        }
    }

    public static int[] rev(int[] arr) {
        int start = 0, end = arr.length - 1;
        helper(arr, start, end);
        return arr;
    }

    public static void helper(int[] arr, int start, int end) {
        if (start > end)
            return;
        helper(arr, start + 1, end - 1);
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
