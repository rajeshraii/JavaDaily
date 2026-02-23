import java.util.Scanner;
public class DubStep {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String upper = s.toUpperCase();
        String result = upper.replaceAll("WUB", " ").trim();
        System.out.println(result);
        sc.close();
    }
}
