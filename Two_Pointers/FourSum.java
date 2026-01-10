import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1 };
        int target = 4;
        System.out.println(four_sum(arr, target));
    }

    static ArrayList<List<Integer>> four_sum(int[] arr, int target) {

        ArrayList<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            for (int j = i + 1; j < arr.length - 2; j++) {
                if (j > i && arr[j] == arr[j - 1])
                    continue;
                int start = j + 1;
                int end = arr.length - 1;
                int sum = 0;
                while (start < end) {
                    sum = arr[i] + arr[j] + arr[start] + arr[end];
                    int left = arr[start];
                    int right = arr[end];
                    List<Integer> inner = new ArrayList<>();
                    if (sum == target) {
                        inner.add(arr[i]);
                        inner.add(arr[j]);
                        inner.add(arr[start]);
                        inner.add(arr[end]);
                        result.add(inner);
                        while (start < end && arr[start] == left)
                            start++;
                        while (end > start && arr[end] == right)
                            end--;

                    } else if (sum < target)
                        start++;
                    else
                        end--;

                }

            }
        }

        return result;
    }
}
