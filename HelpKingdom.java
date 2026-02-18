//Not completed//

import java.util.Scanner;

public class HelpKingdom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();

        int dotIndex = number.indexOf('.');
        String integerPart = number.substring(0, dotIndex);
        String fractionalPart = number.substring(dotIndex + 1);
        sc.close();

        char lastDigit = integerPart.charAt(integerPart.length() - 1);
        if (lastDigit == '9') {
            System.out.println("GOTO Vasilisa.");
            return;
        }
        if (fractionalPart.charAt(0) < '5') {
            System.out.println(integerPart);
        } else {
            int rounded = Integer.parseInt(integerPart) + 1;
            System.out.println(rounded);
        }
    }
}
