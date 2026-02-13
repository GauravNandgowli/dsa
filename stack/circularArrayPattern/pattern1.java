package circularArrayPattern;

public class pattern1 {
    public static void main(String[] args) {
        System.out.println();
        // traversal direction is left to right and traverses once
        // int[] arr = { 1, 2, 3, 4, 5 };
        int[] arr = { 2, 5, 1, 6, 10, 3 };
        int start = 0;
        int direction = 1;
        int length = arr.length;
        for (int offset = 0; offset < length; offset++) {
            int index = (start + direction * offset + length) % length;

            System.out.println(arr[index]);
        }

    }
}
