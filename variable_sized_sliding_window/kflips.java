public class kflips {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 0, 0 };
        // int[] arr = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        // int[] arr = { 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0 };
        int k = 2;
        System.out.println(Kflips(arr, k));

    }

    public static int Kflips(int[] arr, int k) {

        int start = 0, end = 0, cnt = 0, max = 0, ans = Integer.MIN_VALUE;

        while (end < arr.length) {
            if (arr[end] == 0) {
                cnt++;
            }

            while (cnt > k) {
                if (arr[start] == 0)
                    cnt--;
                start++;
            }
            max = end - start + 1;
            ans = Math.max(max, ans);
            end++;
        }
        return ans;
    }
}
