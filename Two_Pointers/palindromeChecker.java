public class palindromeChecker {
  public static void main(String[] args) {
    String s = "race a car";
    System.out.println(check(s));
  }

  public static boolean check(String s) {
    char[] arr = s.toCharArray();
    int i = 0, j = arr.length - 1;
    while (i < j) {
      while (i < j && !isAlNum(arr[i])) {
        i++;
      }
      while (i < j && !isAlNum(arr[j])) {
        j--;
      }
      if (Character.toUpperCase(arr[i]) != Character.toUpperCase(arr[j])) {
        return false;
      }
      i++;
      j--;
    }
    return true;

  }

  public static boolean isAlNum(char c) {

    if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9')
      return true; // imperative
    // return Character.isLetterOrDigit(c); declarative
    return false;
  }
}
