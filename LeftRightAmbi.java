import java.util.Scanner;

public class LeftRightAmbi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int R = sc.nextInt();
        int A = sc.nextInt();

        int diff = Math.abs(L - R);
        int used = Math.min(A, diff);

        if (L < R) {
            L += used;
        } else {
            R += used;
        }

        A -= used;

        L += A / 2;
        R += A / 2;

        int players = 2 * Math.min(L, R);

        System.out.println(players);

        sc.close();
    }
}