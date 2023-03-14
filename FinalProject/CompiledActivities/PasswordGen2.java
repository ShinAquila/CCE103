package CompiledActivities;
import java.util.*;

public class PasswordGen2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        String upperC_Avail = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String lowerC_Avail = "qwertyuiopasdfghjklzxcvbnm";
        String num_Avail = "0123456789";

        char pick = ' ';
        int randomPick = 0;

        System.out.println("[2]"+"-".repeat(24)+"[ Password 2 ]"+"-".repeat(24)+"[2]\n");

        StringBuilder pass2 = new StringBuilder();

            ///--- 2 Numbers ---///
        for (int i = 0; i < 2; i++) {
            randomPick = random.nextInt(num_Avail.length());
            pick = num_Avail.charAt(randomPick);

            pass2.append(pick);
        }

            ///--- 1 UpperCase ---///
        randomPick = random.nextInt(upperC_Avail.length());
        pick = upperC_Avail.charAt(randomPick);

        pass2.append(pick);

            ///--- 5 LowerCase ---///
        for (int i = 0; i < 5; i++) {
            randomPick = random.nextInt(lowerC_Avail.length());
            pick = lowerC_Avail.charAt(randomPick);

            pass2.append(pick);
        }
        System.out.println("> Here is your password: "+pass2);

        scan.close();
    }
}
