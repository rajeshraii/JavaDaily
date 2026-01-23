import java.util.Scanner;

public class TresureHuntt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt(); 
            
            while (t-- > 0) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int a = sc.nextInt();


                int remainder = a % (x + y);
                
                if (remainder < x) {
                    System.out.println("NO");  
                } else {
                    System.out.println("YES"); 
                }
            }
        }
        sc.close();
    }
}