import java.util.Scanner;

public class Reconnaissance2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int minDiff = Integer.MAX_VALUE;
        int p1 = 0, p2 = 1;

        for (int i = 0; i < n - 1; i++) {
            int diff = Math.abs(a[i] - a[i + 1]);
            if (diff < minDiff) {
                minDiff = diff;
                p1 = i;
                p2 = i + 1;
            }
        }

        // circular check: last and first
        int diff = Math.abs(a[n - 1] - a[0]);
        if (diff < minDiff) {
            p1 = n - 1;
            p2 = 0;
        }

        // output 1-based indices
        System.out.println((p1 + 1) + " " + (p2 + 1));

        sc.close();
    }
}
