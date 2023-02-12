import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        ArrayList <String> dictionary = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);

        dictionary.add("booster");
        dictionary.add("rooster");
        dictionary.add("roaster");
        dictionary.add("coasted");

        int indexFirst = 0;
        int indexSecond = 0;

        String pairScan = scan.nextLine();
        String wordPair[] = pairScan.split(" ");
        for (int i = 0; i < dictionary.size(); i++) {
            String word1Pair = wordPair[0];
            String word2Pair = wordPair[1];

            if (dictionary.get(i).equalsIgnoreCase(word1Pair)) {
                indexFirst = dictionary.indexOf(wordPair[0]);
                System.out.println("test");
            }

            if (dictionary.get(i).equalsIgnoreCase(word2Pair)) {
                indexSecond = dictionary.indexOf(wordPair[1]);
                System.out.println("test");
            }
        }
        
        
        System.out.println(indexFirst);
        System.out.println(indexSecond);
        
    }
}
