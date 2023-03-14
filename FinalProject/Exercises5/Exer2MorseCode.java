package Exercises5;

import java.util.*;

public class Exer2MorseCode {
    public static void main(String[] args) {
        Scanner scanINT = new Scanner(System.in);
        Scanner scanSTRING = new Scanner(System.in);

        String doYouContinueString = "";
        boolean doYouContinue = false;
        String category = "";

        String morseCode[][] = {
                { "A", "*-" },  { "B", "-***" },    { "C", "-*-*" },    { "D", "-**" },
                { "E", "*" },   { "F", "**-*" },    { "G", "--*" },     { "H", "****" },
                { "I", "**" },  { "J", "*---" },    { "K", "-*-" },     { "L", "*-**" },
                { "M", "--" },  { "N", "-*" },      { "O", "---" },     { "P", "*--*" },
                { "Q", "--*-" }, { "R", "*-*" },    { "S", "***" },     { "T", "-" },
                { "U", "**-" }, { "V", "***-" },    { "W", "*--" },     { "X", "-**-" },
                { "Y", "-*--" }, { "Z", "--**" },
        };

        System.out.println(">[Part 2: Morse Code Translator]<".indent(21));
        do {
            System.out.println("Category 0 - Convert texts to morse code");
            System.out.println("Category 1 - Convert morse code to texts\n");

            System.out.println("-".repeat(32) + "<[ INPUT ]>" + "-".repeat(32) + "\n");
            System.out.print("[+] Enter the Category: \t");
            category = scanSTRING.nextLine();

            // Category 0 - Texts to Morse Code
            if (category.equals("0")) {
                System.out.println("\n[!] You selected the Category 0 - Convert texts to Morse Code");

                System.out.print("[+] Type your word here separated by - dash (h-e-l-l-o):\t");
                String word = scanSTRING.nextLine();
                String wordSplit[] = word.split("-");

                String convertedToMorse[] = new String[wordSplit.length];

                for (int i = 0; i < wordSplit.length; i++) {
                    for (int j = 0; j < morseCode.length; j++) {
                        if (wordSplit[i].equalsIgnoreCase(morseCode[j][0])) {
                            convertedToMorse[i] = morseCode[j][1];
                        }
                    }
                }

                System.out.println("\n" + "-".repeat(32) + "<[ OUTPUT ]>" + "-".repeat(31));
                String separator = "";
                try {
                    for (int i = 0; i < convertedToMorse.length; i++) {
                        if (!convertedToMorse[i].equals(null)) {
                            System.out.print(separator + convertedToMorse[i]);
                            separator = "|";
                        }
                    }
                } catch (NullPointerException NPex) {
                    System.out.println();
                    System.out.println("<!> Not valid. System Stopped Forcefully.");
                }
                System.out.println();

                // Category 1 - Morse Code to Texts
            } else if (category.equals("1")) {
                System.out.println("\n[!] You selected the Category 1 - Convert Morse Code to Texts");

                System.out.print("[+] Type your word here separated by | symbol (****|**):\t");
                String word = scanSTRING.nextLine();
                String wordSplit[] = word.split("[|]");

                String convertedToText[] = new String[wordSplit.length];

                for (int i = 0; i < wordSplit.length; i++) {
                    for (int j = 0; j < morseCode.length; j++) {
                        if (wordSplit[i].equalsIgnoreCase(morseCode[j][1])) {
                            convertedToText[i] = morseCode[j][0];
                        }
                    }
                }

                System.out.println();
                System.out.println("\n" + "-".repeat(32) + "<[ OUTPUT ]>" + "-".repeat(31));
                try {
                    for (int i = 0; i < convertedToText.length; i++) {
                        if (!convertedToText[i].equals(null)) {
                            System.out.print(convertedToText[i]);
                        }
                    }
                } catch (NullPointerException NPex) {
                    System.out.println();
                    System.out.println("<!> Not valid. System Stopped Forcefully.");
                }
                System.out.println();

            } else {
                System.out.println("<!> Category does not exist");
            }

            boolean notValid = true;
            do {
                notValid = false;
                System.out.print("\n[?] Do you want to continue? Y/N: \t");
                doYouContinueString = scanSTRING.nextLine();
                if (doYouContinueString.equalsIgnoreCase("Y")) {
                    doYouContinue = true;
                    notValid = false;
                } else if (doYouContinueString.equalsIgnoreCase("N")) {
                    doYouContinue = false;
                    notValid = false;
                } else {
                    System.out.println("<!> Not Valid Indicator. Try Again.");
                    notValid = true;
                }
                System.out.println();
            } while (notValid);

            System.out.println(" ".repeat(16) + "]" + "-".repeat(41) + "[");
            System.out.println();

        } while (doYouContinue);

        scanSTRING.close();
        scanINT.close();
    }
}