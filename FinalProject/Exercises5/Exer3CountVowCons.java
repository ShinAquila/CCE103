package Exercises5;
import java.util.*;

public class Exer3CountVowCons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char consonantList[] = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
        char vowelList[] = {'a','e','i','o','u'};
        
        try {
            System.out.println("-".repeat(12)+ "<[ INPUT ]>" +"-".repeat(12)+"\n");
            System.out.print("[+] Enter a word: ");
            String input = scan.nextLine();

            String word = input.toLowerCase();

            int vowelCount = 0;
            int consonantCount = 0;
            for (int i = 0; i < word.length(); i++) {
                for (int j = 0; j < vowelList.length; j++) {
                    if (word.charAt(i) == vowelList[j]) {
                        vowelCount++;
                    }
                }

                for (int j = 0; j < consonantList.length; j++) {
                    if (word.charAt(i) == consonantList[j]) {
                        consonantCount++;
                    }
                }
            }

            System.out.println("\n"+"-".repeat(12)+ "<[ OUTPUT ]>" +"-".repeat(11));
            if (vowelCount == 0 && consonantCount == 0) {
                System.out.println("\n[!] The input is not a letter [!]");
            } else {
                System.out.println("\nVowels: "+vowelCount+" | Consonants: "+consonantCount);
            }
        } catch (Exception e) {
            System.out.println("<!> An error has occured...");
        }
        scan.close();
    }
}
