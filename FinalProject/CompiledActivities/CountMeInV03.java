package CompiledActivities;

import java.util.*;

public class CountMeInV03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("[+] Enter a String: ");
        String wordInput = scan.nextLine();

        wordInput = wordInput.toLowerCase();
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
            if (indexEnd < word.length() - 1) {
                tempLetter = word.charAt(indexEnd+1);
                indexStart = word.indexOf(tempLetter);
                indexEnd = word.lastIndexOf(tempLetter);

                int tempLength = (indexEnd - indexStart) + 1;
                LettersOccur.add(tempLength);
                LettersAvail.add(word.charAt(indexEnd));
            }
        }

        int largest = 0;
        int indexLargeOccur = 0;
        boolean isSameHighest = false;
        for (int i = 0; i < LettersOccur.size(); i++) {
            if (largest < LettersOccur.get(i)) {
                largest = LettersOccur.get(i);
                indexLargeOccur = LettersOccur.indexOf(largest);
                isSameHighest = false;
            } else if (largest == LettersOccur.get(i)) {
                isSameHighest = true;
            }

        }

        if (isSameHighest == false) {
            System.out.println("\n[-] The largest occurrence is " + LettersAvail.get(indexLargeOccur));

        } else if (isSameHighest){
            System.out.println("\n[-] There is no highest occurrence");
        }

        scan.close();
    }
}
