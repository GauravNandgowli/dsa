
import java.util.HashMap;
import java.util.Map;

public class firstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "codeintuition";
        System.out.println(nonRCh(s));
    }

    public static int nonRCh(String s) {

        Map<Character, Integer> map = new HashMap<>();
        System.out.println();
        for (int i = 0; i < s.toCharArray().length; i++) {
            map.merge(s.charAt(i), 1, Integer::sum);

        }
        for (int i = 0; i < s.toCharArray().length; i++) {
            if (map.get(s.charAt(i)) == 1)
                return i;

        }

        return -1;
    }
}
