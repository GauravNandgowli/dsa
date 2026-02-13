import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class sumOfSubarray {
    public static void main(String[] args) {
        System.out.println();
        int[] arr1 = { 11, 81, 94, 43, 3 };

        System.out.println(sumOfSubarrayMins(arr1));

    }

    public static int sumOfSubarrayMins(int[] arr) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        while (count < arr.length) {

            while (!stack.isEmpty() && arr[count] < stack.peek()) {
                stack.pop();
            }

            stack.push(arr[count]);
            sum = sum + stack.peek();
            count++;
        }

        return sum;
    }

    public static int[] arrFill(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        return arr;
    }
}
