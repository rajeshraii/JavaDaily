import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();

        int tilesAlongN = (n + a - 1) / a;
        int tilesAlongM = (m + a - 1) / a;

        int result = tilesAlongN * tilesAlongM;

        System.out.println(result);
        sc.close();
    }
}
