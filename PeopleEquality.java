import java.util.Scanner;

public class PeopleEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        int max = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] > max) {
                max = a[i];
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (max - a[i]);
        }

        System.out.println(sum);
        sc.close();
    }
}
