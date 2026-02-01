import java.util.Scanner;

public class SquareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume newline

        while (t-- > 0) {
            String s = sc.nextLine();
            int n = s.length();

            if (n % 2 != 0) {
                System.out.println("NO");
            } else {
                String first = s.substring(0, n / 2);
                String second = s.substring(n / 2);

                if (first.equals(second)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}