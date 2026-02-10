import java.util.Scanner;

public class Square1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            int l = Integer.parseInt(parts[0]);
            int r = Integer.parseInt(parts[1]);
            int d = Integer.parseInt(parts[2]);
            int u = Integer.parseInt(parts[3]);
            if (l == r && r == d && d == u) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
