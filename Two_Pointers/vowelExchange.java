public class vowelExchange {

    public static void main(String[] args) {

        String s = "IceCreAm";
        System.out.println(vowelExchange(s));
    }

    public static String vowelExchange(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;
        while (i < j) {
            while (i < j && !checkVow(arr[i]))
                i++;
            while (i < j && !checkVow(arr[j]))
                j--;

            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }

        return new String(arr);
    }

    public static boolean checkVow(char c) {
        return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
                || c == 'U';


                //instead of the above use this "AEIOUaeiou".indexOf(c) != -1;
    }

}
