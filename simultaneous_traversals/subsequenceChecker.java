package dsa.simultaneous_traversals;

public class subsequenceChecker {
    public static void main(String[] args) {
        System.out.println(subsequenceChecker("abc", "ahbgdc"));
    }

    public static boolean subsequenceChecker(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        int idx1 = 0;
        int idx2 = 0;

        if (arr1.length > arr2.length)
            return false;
        while (idx1 < arr1.length && idx2 < arr2.length) {
            if (equal(arr1[idx1], arr2[idx2])) {
                idx1++;
                idx2++;

            } else {
                idx2++;
            }

        }

        return idx1 == arr1.length;

    }

    public static boolean equal(char a, char b) {
        return a == b;
    }

}
