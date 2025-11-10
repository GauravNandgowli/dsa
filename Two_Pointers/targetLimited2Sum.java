import java.util.Arrays;

public class targetLimited2Sum {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30 };
        System.out.println(targetLimitedTwoSum(arr, 15));
    }

    public static int targetLimitedTwoSum(int[] arr, int target) {

        Arrays.sort(arr);
        int i = 0, j = arr.length - 1, sum = 0;
        int max = Integer.MIN_VALUE;
        while (i < j) {
            sum = arr[i] + arr[j];
            if (sum < target && sum > max) {
                max = sum;
            }
            if (arr[i] + arr[j] < target)
                i++;
            else
                j--;
        }

        return max;
    }
}
