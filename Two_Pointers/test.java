public class test {
    public static void main(String[] args) {
        int val = 3;
        // int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int[] nums = { 3, 2, 2, 3 };
        System.out.println(removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int j = 0, cnt = 0;
        while (i < nums.length) {
            int temp = 0;
            if (nums[i] == val) {
                j = i;
                while (j < nums.length - 1 && val == nums[j]) {
                    j++;
                }
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                cnt++;
            }
            i++;
        }
        for (int k : nums) {
            System.out.println(k);
        }
        return cnt - 1;
    }

}
