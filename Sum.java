import java.util.Scanner;
public class Sum
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the inputs:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Choose the operator:");
        System.out.println("1.Adition(+)");
        System.out.println("2.Substraction(-)");
        System.out.println("3.Multiplication(*)");
        System.out.println("4.Division(÷)");
        System.out.println("Choose a number between 1 to 4 ");
        int x=sc.nextInt();
        System.out.println("Your choice is on process.")
        switch(x) {
            case 1:
                System.out.println("Addition: " +(a+b));
                break;
            case 2:
                System.out.println("Substraction: " +(a-b));
                break;
            case 3:
                System.out.println("Mulplication: " +(a*b));
                break;
            case 4:
                System.out.println("Division: " +(a/b));
                break;
            default:
                System.out.println("The input is invalid.");
        }
        sc.close();
    }
}
