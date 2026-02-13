package circularArrayPattern;

public class pattern4optimized {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int direction = 1;
        int length = arr.length;
        int windowSize = 3;

        // Step 1: compute first window
        int sum = 0;
        int start = 0;

        for (int offset = 0; offset < windowSize; offset++) {
            int index = (start + direction * offset + length) % length;
            sum += arr[index];
        }

        System.out.println(sum);

        // Step 2: slide window
        for (start = 1; start < length; start++) {

            // element leaving window
            int removeIndex = (start - 1 + length) % length;
            sum -= arr[removeIndex];

            // element entering window
            int addIndex = (start + direction * (windowSize - 1) + length) % length;
            sum += arr[addIndex];

            System.out.println(sum);
        }
    }
}
