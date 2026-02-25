import java.util.*;

public class DiverseStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String s = sc.next();
            Set<Character> set = new HashSet<>();
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            boolean diverse = true;
                if (!set.add(c)) {
                    diverse = false;
                    break;
                }
                min = Math.min(min, c);
                max = Math.max(max, c);
            }
            if (diverse && (max - min != s.length() - 1)) {
                diverse = false;
            }

            System.out.println(diverse ? "Yes" : "No");
        }
        sc.close();
    }
}