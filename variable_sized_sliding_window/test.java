public class test {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int start = 0, end = 0, max = Integer.MIN_VALUE;
        char[] arr = s.toCharArray();

        while (end < arr.length) {
            int cnt = 1;
            int i = 0;
            int newELe = arr[end];
            while (end != 0 && arr[i] != arr[end]) {
                cnt++;
                i++;
            }

            max = Math.max(cnt, max);
            end++;
        }

        return max;
    }

}
