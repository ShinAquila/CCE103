package Exercises5;
import java.util.*;

public class Exer5Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(">[Part 5: Palindrome]<".indent(7));
        System.out.println("-".repeat(12)+ "<[ INPUT ]>" +"-".repeat(12)+"\n");
        System.out.print("[+] Enter a word: ");
        String wordInput = scan.nextLine();

        String word = wordInput.toLowerCase().replaceAll("\\s+", "");

        StringBuilder revWordTemp = new StringBuilder();
        for (int i = word.length()-1; i >= 0 ; i--) {
            revWordTemp.append(word.charAt(i));
        }
        String revWord = revWordTemp.toString();

        System.out.println("\n"+"-".repeat(12)+ "<[ OUTPUT ]>" +"-".repeat(12)+"\n");
        if (revWord.equalsIgnoreCase(word)) {
            System.out.println(wordInput + " is a palindrome");
        } else {
            System.out.println(wordInput + " is NOT a palindrome");
        }

        scan.close();
    }
}
