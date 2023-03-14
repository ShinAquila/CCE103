package CompiledActivities;

import java.util.*;

public class SplitName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("[!] Please put a '-' at the start of your Middle Name [!]\n");
            System.out.print("Enter your name: ");
            String nameInput = scan.nextLine();
            
            String arrName[] = nameInput.split("[ ]");

            System.out.println();
            for (int i = 0; i < arrName.length; i++) {
                if (arrName[i].charAt(0) == '-') {
                    System.out.print(arrName[i].charAt(1) + ". ");
                } else {
                    System.out.print(arrName[i] + " ");
                }
            }
            System.out.println();

            for (int i = 0; i < arrName.length; i++) {
                if (arrName[i].charAt(0) == '-') {
                    System.out.print(arrName[i].charAt(1));
                } else {
                    System.out.print(arrName[i].charAt(0));
                }
            }
        } catch (Exception e) {
            System.out.println("An error has occurred.");
        }

        System.out.println();
        scan.close();
    }
}
