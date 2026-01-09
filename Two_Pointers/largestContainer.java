public class largestContainer {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 3, 5, 2, 4, 3, 2 };
        System.out.println(largestContainer(arr));
    }

    public static int largestContainer(int[] heights) {
        int max = Integer.MIN_VALUE;
        int i = 0, j = heights.length - 1;
        while (i < j) {

            max = Math.max(((j - i) * Math.min(heights[i], heights[j])), max);
            if (heights[i] == heights[j]) {
                i++;
                j--;

            } else if (heights[i] < heights[j])
                i++;
            else
                j--;

        }

        return max;
    }
}
