package ProgUsingRandom;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class passGen {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        String all_Avail = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM0123456789";
        String upperC_Avail = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String lowerC_Avail = "qwertyuiopasdfghjklzxcvbnm";
        String num_Avail = "0123456789";

        char pick = ' ';
        int randomPick = 0;

        //----- Password 1 -----//
        System.out.println("[1]"+"-".repeat(24)+"[ Password 1 ]"+"-".repeat(24)+"[1]\n");

        StringBuilder pass1 = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            randomPick = random.nextInt(all_Avail.length()-1);
            pick = all_Avail.charAt(randomPick);

            pass1.append(pick);
        }
        System.out.println("> Here is your password: "+pass1);
        System.out.println();
        
        
        //----- Password 2 -----//
        System.out.println("[2]"+"-".repeat(24)+"[ Password 2 ]"+"-".repeat(24)+"[2]\n");

        StringBuilder pass2 = new StringBuilder();

            ///--- 2 Numbers ---///
        for (int i = 0; i < 2; i++) {
            randomPick = random.nextInt(num_Avail.length()-1);
            pick = num_Avail.charAt(randomPick);

            pass2.append(pick);
        }

            ///--- 1 UpperCase ---///
        for (int i = 0; i < 1; i++) {
            randomPick = random.nextInt(upperC_Avail.length()-1);
            pick = upperC_Avail.charAt(randomPick);

            pass2.append(pick);
        }

            ///--- 5 LowerCase ---///
        for (int i = 0; i < 5; i++) {
            randomPick = random.nextInt(lowerC_Avail.length()-1);
            pick = lowerC_Avail.charAt(randomPick);

            pass2.append(pick);
        }
        System.out.println("> Here is your password: "+pass2);
        

        //----- Password 3 -----//
        System.out.println();
        System.out.println("-".repeat(68));
        System.out.println();

        StringBuilder pass3 = new StringBuilder();
        int charAsk = 0;

        do {
            boolean inputInvalid = true;
            
            while (inputInvalid) {
                try {
                    System.out.print("[?] How many characters do you want in your password? ");
                    charAsk = scan.nextInt();
                    inputInvalid = false;
                } catch (InputMismatchException IMEx) {
                    scan.nextLine();
                    System.out.println("\n[<!>] Invalid Input Try Again [<!>]");
                    inputInvalid = true;
                }
            }

            if (charAsk < 5) {
                System.out.println("\n[!] Your password must have at least 5 characters [!]");
            }
        } while (charAsk < 5);
        
        scan.close();

        for (int i = 0; i < charAsk; i++) {
            randomPick = random.nextInt(all_Avail.length()-1);
            pick = all_Avail.charAt(randomPick);

            pass3.append(pick); 
        }
        System.out.println("\n[3]"+"-".repeat(24)+"[ Password 3 ]"+"-".repeat(24)+"[3]\n");

        System.out.println("> Here is your password: "+pass3);
    }
}
