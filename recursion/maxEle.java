public class maxEle {
    public static void main(String[] args) {
        System.out.println();
        int[] arr = { 1, 5, 3, 69 };
        int max = Integer.MIN_VALUE, left = 0,
                right = arr.length - 1;

        System.out.println(max(arr, left, right));
    }

    public static int max(int[] arr, int left, int right) {
        int mid = left + (right - left) / 2;
        if (left >= right)
            return arr[mid];
        return Math.max(max(arr, left, mid), max(arr, mid + 1, right));
    }
}
