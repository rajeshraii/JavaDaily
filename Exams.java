import java.util.Scanner;

public class Exams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int maxNonSquare = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            
            if (!isPerfectSquare(num)) {
                if (num > maxNonSquare) {
                    maxNonSquare = num;
                }
            }
        }
        
        System.out.println(maxNonSquare);
        sc.close();
    }
    public static boolean isPerfectSquare(int x) {
        if (x < 0) return false;
        
        int sqrt = (int) Math.sqrt(x);
        return (sqrt * sqrt == x);
    }
}