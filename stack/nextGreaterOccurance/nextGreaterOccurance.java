package nextGreaterOccurance;

import java.util.*;

public class nextGreaterOccurance {
    public static void main(String[] args) {
        System.out.println();
        int[] arr1 = { 1, 6, 3, 4, 2, 5 };
        int[] res = nextSuperiorElement(arr1);
        for (int i : res) {
            System.out.println(i);
        }
    }

    public static int[] nextSuperiorElement(int[] arr1) {
        int[] resArr1 = new int[arr1.length];
        resArr1 = arrFill(resArr1);
        // Stack<List<Integer>> stack = new Stack<>();
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        while (count < arr1.length) {

            while (!stack.isEmpty() && arr1[count] > arr1[stack.peek()]) {
                int popIndex = stack.pop();
                resArr1[popIndex] = arr1[count];
            }
            stack.push(count);
            count++;
        }

        return resArr1;
    }

    public static int[] arrFill(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        return arr;
    }
}
