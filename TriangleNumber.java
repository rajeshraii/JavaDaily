import java.util.Scanner;

public class TriangleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int value = 8 * n + 1;
        int sqrt = (int) Math.sqrt(value);
        
        if (sqrt * sqrt == value) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        sc.close();
    }
}
