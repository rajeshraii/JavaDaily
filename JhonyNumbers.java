import java.util.*;

public class JhonyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = (n / k + 1) * k;

        System.out.println(x);
        sc.close();
    }
}