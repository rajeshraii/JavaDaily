///A word or a sentence in some language is called a pangram if all the characters of the alphabet of this language appear in it at least once.
//  Pangrams are often used to demonstrate fonts in printing or test the output devices.
//You are given a string consisting of lowercase and uppercase Latin letters. Check whether this string is a pangram. We say that 
// the string contains a letter of the Latin alphabet if this letter occurs in the string in uppercase or lowercase.

//Input
//The first line contains a single integer n (1≤n≤100) — the number of characters in the string.
//The second line contains the string. The string consists only of uppercase and lowercase Latin letters.

//Output
//Output "YES", if the string is a pangram and "NO" otherwise.


import java.util.Scanner;
public class Pangram {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        s = s.toLowerCase();
        boolean[] alphabet = new boolean[26];
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a'] = true;
            }
        }
        boolean isPangram = true;
        for (boolean b : alphabet) {
            if (!b) {
                isPangram = false;
                break;
            }
        }
        System.out.println(isPangram ? "YES" : "NO");
        sc.close();
    }

}
