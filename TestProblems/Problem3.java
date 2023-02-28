package TestProblems;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList <String> dictionary = new ArrayList<String>();
        ArrayList <String> doublet = new ArrayList<String>();
        String dictionaryScan = "a";
        String pairScan = "a";

        System.out.println("PRESS [ENTER] AGAIN AFTER INPUT TO STOP SCANNING\n");

        System.out.println("INPUT");
        while (!dictionaryScan.equals("")) {
            if (!dictionaryScan.equals("")) {
                dictionaryScan = scan.nextLine();
                dictionary.add(dictionaryScan);
    
                
            }
        }
        
        int indexFirst = 0;
        int indexSecond = 0;

        String word1Pair = "";
        String word2Pair = "";
        while (!pairScan.equals("")) {
            pairScan = scan.nextLine();
            if (!pairScan.equals("")) {
                String wordPair[] = pairScan.split(" ");
                
                for (int i = 0; i < dictionary.size(); i++) {
                    word1Pair = wordPair[0];
                    word2Pair = wordPair[1];

                    if (dictionary.get(i).equalsIgnoreCase(word1Pair)) {
                        indexFirst = dictionary.indexOf(wordPair[0]);
                    }
        
                    if (dictionary.get(i).equalsIgnoreCase(word2Pair)) {
                        indexSecond = dictionary.indexOf(wordPair[1]);
                    }
                }

                
            }
        }

        
        String temp = "";
        int notDoubletCount = 0;
        for (int i = indexFirst; i <= indexSecond; i++) {
            int j = indexFirst;
            String word1 = dictionary.get(i);
            String word2 = dictionary.get(j);

            System.out.println(i+" Test: "+word1);

            
            char word1Arr[] = word1.toCharArray(); 
            char word2Arr[] = word2.toCharArray(); 
            
            for (int wrd1CharNum = 0; wrd1CharNum < word1Arr.length; wrd1CharNum++) {
                int wrd2CharNum = 0;
                

                if (word1Arr[wrd1CharNum] != word2Arr[wrd2CharNum]) {
                    notDoubletCount++;
                }
                
            }
            
            if (notDoubletCount == 1 && !temp.equals(word1)) {
                doublet.add(word1);
            }

            temp = word1;
            notDoubletCount = 0;
            
        }


        
        System.out.println("\nOUTPUT");
        
        for (int i = 0; i < doublet.size(); i++) {
            System.out.println(doublet.get(i));
        }
        scan.close();
    }
}
