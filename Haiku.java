import java.util.Scanner;
public class Haiku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] required = {5, 7, 5};
        for (int i = 0; i < 3; i++) {
            String line = sc.nextLine();
            int count = 0;
            for (char c : line.toCharArray())
                if ("aeiou".indexOf(c) >= 0) count++;
            if (count != required[i]) { System.out.println("NO"); return; }
        }
        System.out.println("YES");
        sc.close();
    }
}