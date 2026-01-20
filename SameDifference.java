import java.util.Scanner;
public class SameDifference {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int changes=0;
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); 
            for(int j=1;j<=n;j++){
                String s = sc.nextLine();
                char firstChar = s.charAt(0);
                for(int k=1;k<s.length();k++){
                    if(s.charAt(k) != firstChar){
                        changes++;
                    }
                }
            }
        }
                    System.out.println(changes);
                    sc.close();
    }
}

