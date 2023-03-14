package CompiledActivities;

import java.util.*;

public class NameOfFortune {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        String names[] = { "Christine", "Mariano", "Rovic", "Juana", "Jhon Carlo", "Edsel", "Asnari", "Khiane", "Ace",
                "Kyll John", "Prince", "Aliazer", "Allan", "Angelyn", "Arjay", "Cristian", "Gretchel", "Ghlen",
                "Justine", "Kenric", "Nelven", "Nixel", "Renz Ivan", "Fritzie Apple", "Brent" };

        int pickedNum = rand.nextInt(names.length);

        String startInput = "";
        do {
            System.out.print("[+] Pick a Random Student for Oral (Enter 1): ");
            startInput = scan.nextLine();

            if (!startInput.equals("1")) {
                System.out.println("<!> Try Again...");
            }
        } while (!startInput.equals("1"));

        System.out.println("\n[-] "+names[pickedNum]+" will be Oral Reciting!");
        scan.close();
    }
}