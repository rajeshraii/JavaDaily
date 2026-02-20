import java.util.Scanner;
public class Translation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        StringBuilder sb = new StringBuilder(b);
        sb.reverse();
        b = sb.toString();
        if(a.equals(b)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
