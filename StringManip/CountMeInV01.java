package StringManip;

import java.util.*;

public class CountMeInV01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String wordInput = scan.nextLine();

        wordInput = wordInput.toLowerCase();
        char wordArray[] = wordInput.toCharArray();
        Arrays.sort(wordArray);

        StringBuilder wordTemp = new StringBuilder();
        for (int i = 0; i < wordArray.length; i++) {
            wordTemp.append(wordArray[i]);
        }
        String word = wordTemp.toString();

        ArrayList<Integer> LettersOccurence = new ArrayList<>();
        ArrayList<Character> LettersAvail = new ArrayList<>();

        int counterTemp = 0;
        for (int i = 0; i < word.length(); i++) {
            int counter = 0;

            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    counter++;
                }

            }

            if (counterTemp != counter) {
                LettersOccurence.add(counter);
                LettersAvail.add(word.charAt(i));
            }

            counterTemp = counter;
        }

        int largest = 0;
        int indexLargeOccur = 0;
        for (int i = 0; i < LettersOccurence.size(); i++) {
            if (largest < LettersOccurence.get(i)) {
                largest = LettersOccurence.get(i);
                indexLargeOccur = LettersOccurence.indexOf(largest);
            }

        }

        System.out.println("\nThe largest occurrence is " + LettersAvail.get(indexLargeOccur));

        scan.close();
    }
}
