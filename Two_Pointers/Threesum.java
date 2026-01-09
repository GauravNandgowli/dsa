import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Threesum {

    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSum(arr));
    }

    static ArrayList<List<Integer>> threeSum(int[] arr) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;

            int start = i + 1;
            int end = arr.length - 1;
            while (start < end) {
                // if (arr[start] == arr[end]) {
                // if (arr[start] == arr[i])
                // start++;
                // else
                // end--;
                // } else if (arr[i] == arr[start])
                // start++;
                // else if (arr[i] == arr[end])
                // end--;
                // else {
                int sum = arr[i] + arr[start] + arr[end];

                int left = arr[start];
                int right = arr[end];
                int top = arr[i];

                // // skip duplicates
                // while (top < arr.length - 2 && arr[i] == top)
                // i++;

                List<Integer> inner = new ArrayList<>();
                if (sum == 0) {
                    inner.add(arr[i]);
                    inner.add(arr[start]);
                    inner.add(arr[end]);
                    result.add(inner);
                    while (start < end && arr[start] == left)
                        start++;
                    while (end > start && arr[end] == right)
                        end--;
                } else if (sum < 0)
                    start++;
                else
                    end--;

            }

        }

        return result;
    }
}
