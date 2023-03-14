package CompiledActivities;
import java.util.*;

public class PasswordGen3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        String all_Avail = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM0123456789";

        char pick = ' ';
        int randomPick = 0;

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
            randomPick = random.nextInt(all_Avail.length());
            pick = all_Avail.charAt(randomPick);

            pass3.append(pick); 
        }
        System.out.println("\n[3]"+"-".repeat(24)+"[ Password 3 ]"+"-".repeat(24)+"[3]\n");

        System.out.println("> Here is your password: "+pass3);
    }
}
