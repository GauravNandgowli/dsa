public class test {
    public static void main(String[] args) {
        System.out.println("hello");
        // int[] arr = { 0, 0, 0, 0 };
        int[] arr = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        // int[] arr = { 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0 };
        int k = 2;
        Kflips(arr, k);

    }

    public static int Kflips(int[] arr, int k) {

        int start = 0, end = 0, max = Integer.MIN_VALUE, cnt = 0, zeroCount = 0;

        while (end < arr.length) {

            if (arr[end] == 0) {
                zeroCount++;
            }

            if (zeroCount == k) {
                cnt = end - start + 1;
                max = Math.max(max, cnt);
                // System.out.println(max);
            }

            while (zeroCount > k) {
                if (arr[start] == 0)
                    zeroCount--;
                start++;
            }

            end++;
        }

        return max;
    }
}
