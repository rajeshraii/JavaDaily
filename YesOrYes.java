import java.util.Scanner;
public class YesOrYes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        for(int i = 0;i< t;i++){
        String s = sc.nextLine();
        
        if(s.equalsIgnoreCase("yes")){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
        sc.close();
    }
    
}
