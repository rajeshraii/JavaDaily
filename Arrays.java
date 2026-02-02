import java.util.*;

public class Arrays{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int nA = sc.nextInt();
        int nB = sc.nextInt();

        int k = sc.nextInt();
        int m = sc.nextInt();

        int[] A = new int[nA];
        int[] B = new int[nB];

        for (int i = 0; i < nA; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < nB; i++) {
            B[i] = sc.nextInt();
        }

        if (A[k - 1] < B[nB - m]) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}

