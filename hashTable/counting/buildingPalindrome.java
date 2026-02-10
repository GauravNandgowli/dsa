import java.util.HashMap;
import java.util.Map;

public class buildingPalindrome {
    public static void main(String[] args) {
        System.out.println();
        String s1 = "a";
        System.out.println(constructibilityCheck(s1));
    }

    public static int constructibilityCheck(String s1) {
        if (s1.length() == 0)
            return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character ch : s1.toCharArray()) {
            map.compute(ch, (k, val) -> {
                return val == null ? 1 : val + 1;
            });
        }
        boolean isMiddle = false;
        int sum = 0;
        for (Map.Entry<Character, Integer> ent : map.entrySet()) {
            if (ent.getValue() % 2 == 0) {
                sum = sum + ent.getValue();
            } else {
                isMiddle = true;
                sum = sum + (ent.getValue() - (ent.getValue() % 2));
            }

        }
        if (isMiddle)
            return sum + 1;
        else
            return sum;
    }
}
