public class reverseArray {
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
        return helper(arr, start, end);
    }

    public static int[] helper(int[] arr, int start, int end) {
        if (start > end)
            return arr;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return helper(arr, start + 1, end - 1);
    }
}
