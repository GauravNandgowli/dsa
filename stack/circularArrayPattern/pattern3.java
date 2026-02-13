package circularArrayPattern;

public class pattern3 {
    public static void main(String[] args) {
        System.out.println();
        // In most problems, we only process during the first n indices. 2n pass
        int[] arr = { 1, 2, 3, 4, 5 };
        int start = 0;
        int direction = -1;
        int length = arr.length;
        for (int offset = 0; offset < 2 * length; offset++) {
            int index = (start + direction * offset + length) % length;
            System.out.println(arr[index]);
        }

    }
}

/*
 * 
 * for (int offset = 0; offset < 2 * n; offset++) {
 * int index = (offset % n);
 * 
 * if (offset < n) {
 * // push into stack
 * } else {
 * // only resolve pending elements
 * }
 * }
 * 
 * 
 * 
 */