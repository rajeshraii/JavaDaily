import java.util.Scanner;

public class AlmostPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int countAlmostPrime = 0;

        for (int i = 2; i <= n; i++) {
            int num = i;
            int primeCount = 0;

            for (int p = 2; p * p <= num; p++) {
                if (num % p == 0) {
                    primeCount++;
                    while (num % p == 0) {
                        num /= p;
                    }
                }
            }
            if (num > 1) {
                primeCount++;
            }

            if (primeCount == 2) {
                countAlmostPrime++;
            }
        }

        System.out.println(countAlmostPrime);
        sc.close();
    }
}
