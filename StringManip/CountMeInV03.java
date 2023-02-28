package StringManip;

import java.util.*;

public class CountMeInV03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String wordInput = scan.nextLine();

        wordInput.toLowerCase();
        char wordArray[] = wordInput.toCharArray();
        Arrays.sort(wordArray);

        StringBuilder wordTemp = new StringBuilder();
        for (int i = 0; i < wordArray.length; i++) {
            wordTemp.append(wordArray[i]);
        }
        String word = wordTemp.toString();

        ArrayList<Character> LettersAvail = new ArrayList<>();
        ArrayList<Integer> LettersOccur = new ArrayList<>();

        int indexStart = 0;
        int indexEnd = 0;
        char tempLetter = ' ';
        for (int i = 0; i < word.length(); i++) {
            if (indexEnd == 0) {
                tempLetter = word.charAt(0);
            }

            if (indexEnd < word.length()-1) {
                tempLetter = word.charAt(indexEnd + 1);
                indexStart = word.indexOf(tempLetter);
                indexEnd = word.lastIndexOf(tempLetter);

                int tempLength = (indexEnd - indexStart) + 1;
                LettersOccur.add(tempLength);
                LettersAvail.add(word.charAt(indexEnd));
            }

        }

        int largest = 0;
        int indexLargeOccur = 0;
        for (int i = 0; i < LettersOccur.size(); i++) {
            if (largest < LettersOccur.get(i)) {
                largest = LettersOccur.get(i);
                indexLargeOccur = LettersOccur.indexOf(largest);
            }

        }

        System.out.println("\nThe largest occurence is " + LettersAvail.get(indexLargeOccur));

        scan.close();
    }
}
