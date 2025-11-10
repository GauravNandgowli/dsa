import java.util.ArrayList;
import java.util.List;

public class Threesum {

    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSum(arr));
    }

    static ArrayList<List<Integer>> threeSum(int[] arr) {
        ArrayList<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int start = i + 1, end = arr.length - 1;
            while (start < end) {
                int sum = arr[i] + arr[start] + arr[end];
                List<Integer> inner = new ArrayList<>();
                if (sum == 0) {
                    inner.add(arr[i]);
                    inner.add(arr[start]);
                    inner.add(arr[end]);
                    result.add(inner);
                }
                if (sum < 0)
                    start++;
                else
                    end--;
            }
        }

        return result;
    }
}
