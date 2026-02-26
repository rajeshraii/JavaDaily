import java.util.Scanner;

public class FakeNews {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String r = s.toLowerCase();
        String t = "heidi";
        int i = 0;
        for (char c : r.toCharArray()) {
            if (i < t.length() && c == t.charAt(i)) i++;
        }
        System.out.println(i == t.length() ? "YES" : "NO");
        sc.close();
    }
}