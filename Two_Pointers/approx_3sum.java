import java.util.Arrays;

public class approx_3sum {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int target = 3;
        System.out.println(approximateThreeSum(arr, target));
    }

    public static int approximateThreeSum(int[] arr, int target) {
        Arrays.sort(arr);
        int res = 0;
        int min_distance = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 2; i++) {
            int start = i + 1;
            int end = arr.length - 1;
            while (start < end) {
                int sum = arr[i] + arr[start] + arr[end];
                int distance = Math.abs(sum - target);
                if (distance < min_distance)
                    res = sum;
                min_distance = Math.min(distance, min_distance);
                if (sum < target)
                    start++;
                else
                    end--;

            }

        }

        return res;
    }
}
