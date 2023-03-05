package OtherTest;
import java.util.*;

public class Exer1AnagramV02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input[] = new String[2];

        try {
            do {
                System.out.println("-".repeat(12)+ "<[ INPUT ]>" +"-".repeat(12)+"\n");
                for (int i = 0; i < input.length; i++) {
                    System.out.print("[ "+ (i+1) +" ] Enter any number/word: ");
                    input[i] = scan.nextLine(); 
                }

                if (input[0].length()>20) {
                    System.out.println("\nInput 1 Exceeded 20 characters");
                }
                if (input[1].length()>20) {
                    System.out.println("\nInput 2 Exceeded 20 characters");
                }
                System.out.println();
            } while (input[0].length()>20 || input[1].length()>20);
    
            String word1 = input[0].toLowerCase().replaceAll("[\\s+ \\W+]", "");
            String word2 = input[1].toLowerCase().replaceAll("[\\s+ \\W+]", "");
    
            boolean isAnagram = true;
            for (int i = 0; i < word1.length(); i++) {
                for (int j = 0; j < word2.length(); j++) {
                    if (word1.charAt(i) == word2.charAt(j) && (word1.length() == word2.length())) {
                        isAnagram = true;
                        break;
                    } else {
                        isAnagram = false;
                    }
                }
            }

            System.out.println("-".repeat(12)+ "<[ OUTPUT ]>" +"-".repeat(12));
    
            System.out.print("\n[!] "+input[0] + " and " + input[1] + " are ");
            if (isAnagram) {
                System.out.print("Anagrams <OK>\n");
            } else if (isAnagram == false) {
                System.out.print("NOT Anagrams <XX>\n");
            }
        } catch (Exception e) {
            System.out.println("An Error has occurred...");
        }
        
        scan.close();
    }
}
