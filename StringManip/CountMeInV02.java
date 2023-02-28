// KINAWAT NGA IDEA NI ASNARI UWU

package StringManip;

import java.util.*;

public class CountMeInV02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char alphabet[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z', };

        int occurList[] = new int[alphabet.length];

        System.out.print("Enter a String: ");
        String wordInput = scan.nextLine();

        char wordArray[] = wordInput.toCharArray();
        Arrays.sort(wordArray);

        StringBuilder wordTemp = new StringBuilder();
        for (int i = 0; i < wordArray.length; i++) {
            wordTemp.append(wordArray[i]);
        }
        String word = wordTemp.toString().toLowerCase();

        for (int i = 0; i < alphabet.length; i++) {
            int counter = 0;
            for (int j = 0; j < word.length(); j++) {
                if (alphabet[i] == word.charAt(j)) {
                    counter++;
                }
            }

            occurList[i] = counter;

        }

        System.out.println(Arrays.toString(occurList));

        int largest = 0;
        int indexLargeOccur = 0;
        for (int i = 0; i < occurList.length; i++) {
            if (largest < occurList[i]) {
                largest = occurList[i];
                indexLargeOccur = occurList[largest];
            }

        }

        System.out.println("\nThe largest occurrence is " + alphabet[indexLargeOccur]);
        scan.close();
    }
}
