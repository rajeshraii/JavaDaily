import java.util.Scanner;

public class JourneyB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if (a >= n) {
                System.out.println("1");
            } else if (a + b >= n) {
                System.out.println("2");
            } else if (a + b + c >= n) {
                System.out.println("3");
            } else if (a + b >= 5) {
                System.out.println("More than 3");
            }
        }
        sc.close();
    }
}
