import java.util.Scanner;

public class FalseAlaram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
            for(int j=arr[0];j<=arr.length;j++){
              if(arr[j]==1 && (arr[n]-arr[j])<=x){
                    System.out.println("YES");
                    }else{
                        System.out.println("NO");
                }
            }

            }
sc.close();
    }
}