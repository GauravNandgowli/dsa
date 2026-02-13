package circularArrayPattern;

public class pattern4 {
    public static void main(String[] args) {
        // sliding window
        System.out.println();
        int[] arr = { 1, 2, 3, 4, 5 };
        // int start = 0;
        int direction = 1;
        int length = arr.length;
        int windowSize = 3;
        for (int start = 0; start < length; start++) {
            for (int offset = 0; offset < windowSize; offset++) {
                int index = (start + direction * offset + length) % length;
                System.out.print(arr[index] + " ");
            }
            System.out.println();
        }
    }
}

// cannot be optimized further then n*k, as we need to maintain a computational
// value such as sum,min,max etc
