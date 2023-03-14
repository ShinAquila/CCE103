import java.util.*;

public class morse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String morseList[][] = { 
                { "A", "*-" }, { "B", "-***" }, { "C", "-*-*" }, { "D", "-**" },
                { "E", "*" }, { "F", "**-*" }, { "G", "--*" }, { "H", "****" },
                { "I", "**" }, { "J", "*---" }, { "K", "-*-" }, { "L", "*-**" },
                { "M", "--" }, { "N", "-*" }, { "O", "---" }, { "P", "*--*" },
                { "Q", "--*-" }, { "R", "*-*" }, { "S", "***" }, { "T", "-" },
                { "U", "**-" }, { "V", "***-" }, { "W", "*--" }, { "X", "-**-" },
                { "Y", "-*--" }, { "Z", "--**" }, 
            };

        System.out.print("Type your word here separated by - dash: ");
        String text = scan.nextLine();

        String textArray[] = text.split("-");

        for (int i = 0; i < textArray.length; i++) {
            for (int j = 0; j < morseList.length; j++) {
                if (textArray[i].equalsIgnoreCase(morseList[j][0])) {
                    System.out.print(morseList[j][1] + "|");
                }
            }
        }
        System.out.println();
    }
}
