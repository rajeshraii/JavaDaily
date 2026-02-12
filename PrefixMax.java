import java.util.Scanner;
public class PrefixMax{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        int sum =0;
        for (int i =0;i< t;i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j =0;j<n;j++){
                arr[j] = sc.nextInt();
            }
        }
        sc.close();
    }
}