import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();

        int s = (n + a - 1) / a;
        int r = (m + a - 1) / a;

        int result = s * r;

        System.out.println(result);
        sc.close();
    }
}
