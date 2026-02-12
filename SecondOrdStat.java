
import java.util.*;

public class SecondOrdStatg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int x : arr) {
            min = Math.min(min, x);
        }
        int secondMin = Integer.MAX_VALUE;
        for (int x : arr) {
            if (x > min && x < secondMin) {
                secondMin = x;
            }
        }
        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("NO");
        } else {
            System.out.println(secondMin);
        }
        sc.close();
    }
}
