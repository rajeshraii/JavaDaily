import java.util.Scanner;

public class EpicGame {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        int n = sc.nextInt();

        boolean simonTurn = true;

        while (true) {
            if (simonTurn) {
                int g = gcd(a, n);
                if (n < g) {
                    System.out.println(1); 
                    break;
                }
                n -= g;
            } else {
                int g = gcd(b, n);
                if (n < g) {
                    System.out.println(0); 
                    break;
                }
                n -= g;
            }
            simonTurn = !simonTurn;
        }

        sc.close();
    }
}
