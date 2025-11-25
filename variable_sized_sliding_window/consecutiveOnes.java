package dsa.variable_sized_sliding_window;

public class consecutiveOnes {
    public static void main(String[] args) {
        // int[] arr = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        // int[] arr = { 1, 1, 0, 0, 0, 1, 1, 0, 1, 0 };
        int[] arr = { 0, 0, 0 };

        System.out.println(cntOnes(arr));
    }

    static int cntOnes(int[] arr) {
        int start = 0, end = 0, cnt = 0, max = Integer.MIN_VALUE;

        while (end < arr.length) {
            if (arr[end] == 1) {
                System.out.println("hjhj");
                max = Math.max(cnt, max);
                cnt++;
            }

            if (arr[end] == 0) {
                System.out.println("oiuyt");
                cnt--;
                start++;
            }

            end++;
        }
        return max;
    }

    /*
     * 
     * static int cntOnes(int[] arr) {
     * 
     * 
     * // single pointer solution
     * 
     * 
     * int start = 0, end = 0, aggr = 0, cnt = 0, max = Integer.MIN_VALUE;
     * while (end < arr.length) {
     * if (arr[end] == 1)
     * cnt++;
     * if (arr[end] != 1 || end == arr.length - 1) {
     * max = Math.max(cnt, max);
     * cnt = 0;
     * }
     * 
     * end++;
     * }
     * 
     * return max;
     * }
     * 
     */
}
