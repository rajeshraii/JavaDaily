import java.util.Scanner;

public class ToyArmy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = (3 * n) / 2;

        System.out.println(result);
        sc.close();
    }
}