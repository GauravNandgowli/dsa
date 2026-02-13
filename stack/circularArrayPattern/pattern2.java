package circularArrayPattern;

public class pattern2 {
    public static void main(String[] args) {
        System.out.println();
        // traversal direction is right to left and traverses once
        int[] arr = { 1, 2, 3, 4, 5 };
        int start = 2;
        int direction = -1;
        int length = arr.length;
        for (int offset = 0; offset < length; offset++) {
            int index = (start + direction * offset + length) % length;
            System.out.println(arr[index]);
        }

    }
}
