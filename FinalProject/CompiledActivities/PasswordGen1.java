package CompiledActivities;
import java.util.*;

public class PasswordGen1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        String all_Avail = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM0123456789";

        char pick = ' ';
        int randomPick = 0;

        System.out.println("[1]"+"-".repeat(24)+"[ Password 1 ]"+"-".repeat(24)+"[1]\n");

        StringBuilder pass1 = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            randomPick = random.nextInt(all_Avail.length());
            pick = all_Avail.charAt(randomPick);

            pass1.append(pick);
        }
        System.out.println("> Here is your password: "+pass1);
        scan.close();
    }
}
