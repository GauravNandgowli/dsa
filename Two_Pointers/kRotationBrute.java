public class kRotationBrute {
    public static void main(String[] args) {
        int[] arr = { -4, -1, -1, 0, 1, 2 };
        int k = 2;
        arr = kRotate(arr, k);
    }

    static int[] kRotate(int[] arr, int k) {

        int[] temp = new int[arr.length];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }

        for (int i : temp) {
            System.out.println(i);
        }

        return temp;
    }
}
