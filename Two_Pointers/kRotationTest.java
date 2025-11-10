import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class kRotationTest {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 3;
        arr = kRotate(arr, k - 1);
    }

    static int[] kRotate(int[] arr, int k) {
        int j = 0;
        int[] temp = new int[arr.length];

        for (int i = k; i < arr.length; i++) {
            temp[j++] = arr[i];
        }

        for (int i = 0; i < k; i++) {
            temp[j++] = arr[i];
        }

        for (int i : temp) {
            System.out.println(i);
        }
        return arr;
    }
}
