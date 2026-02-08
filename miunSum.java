public class miunSum {
    public static void main(String[] args) {
        int[] arr = { 4, 4, 5, 6, 4 };
        System.out.println(minSum(arr, 3));

    }

    public static int minSum(int[] arr, int k) {
        int start = 0, end = 0, min = Integer.MAX_VALUE, sum = 0;

        while (end < arr.length) {
            sum = sum + arr[end];
            if (end - start + 1 > k) {
                sum -= arr[start];
                start++;
            }
            if (end - start + 1 == k) {
                min = Math.min(min, sum);
            }

            end++;

        }
        return min;
        

    }

}

def min_sum(arr):
