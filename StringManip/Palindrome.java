package StringManip;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scan.nextLine();

        StringBuilder revWordTemp = new StringBuilder();
        for (int i = word.length()-1; i >= 0 ; i--) {
            revWordTemp.append(word.charAt(i));
        }
        String revWord = revWordTemp.toString();

        if (revWord.equalsIgnoreCase(word)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is NOT a palindrome");
        }

        scan.close();
    }
}
