import java.util.*;

public class FalseAlaram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int i = 0;
            while (i < n && a[i] == 0) {
                i++;
            }
            i += x;
            boolean possible = true;
            while (i < n) {
                if (a[i] == 1) {
                    possible = false;
                    break;
                }
                i++;
            }
            System.out.println(possible ? "YES" : "NO");
        }
        sc.close();
    }
}