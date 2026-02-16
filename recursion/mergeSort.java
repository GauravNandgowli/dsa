public class mergeSort {
    public static void main(String[] args) {

        System.out.println();
        int[] arr = { 1, 5, 3, 69 };
        int[] res = new int[arr.length];
        int left = 0, right = arr.length - 1;
        arr = merge(arr, res, left, right);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int[] merge(int[] arr, int[] res, int left, int right) {
        int mid = left + (right - left) / 2;
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        if (left >= right)
            return temp;

        if (arr[i] < arr[j]) {
            temp[k++] = arr[i];
        } else
            temp[k++] = arr[j];

        return res;
    }
}
