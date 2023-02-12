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
        int counter = 0;

        System.out.println("PRESS ENTER AGAIN TO STOP SCANNING\n");

        System.out.println("INPUT");
        while (!dictionaryScan.equals("")) {
            if (!dictionaryScan.equals("")) {
                dictionaryScan = scan.nextLine();
                dictionary.add(dictionaryScan);
    
                counter++; 
                
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
        

        int notDoubletCount = 0;
        for (int i = indexFirst; i <= indexSecond; i++) {
            for (int j = indexFirst; j <= indexSecond; j++) {
                String word1 = dictionary.get(i);
                String word2 = dictionary.get(j);

                char word1Arr[] = word1.toCharArray(); 
                char word2Arr[] = word2.toCharArray(); 

                int k2 = 0;
                for (int k = 0; k < word1Arr.length; k++) {

                    if (word1Arr[k] != word2Arr[k2]) {
                        notDoubletCount++;
                    }
                    k2++;

                }

                if (notDoubletCount < 2) {
                    doublet.add(word2);
                }


                // for (int a = 0; a < dictionary.size(); a++) {
                    
                //     if (i == 0) {
                //         if (notDoubletCount < 2) {
                //             doublet.add(word1);
                //         }
                        
                //     }
                    
                //     if (i > 0) {
                //         String temp = doublet.get(a);

                //         if (notDoubletCount < 2 && (!temp.equals(word1))) {
                //             doublet.add(word1);
                //         }
                        
                //     }

                    
                // }
                notDoubletCount = 0;
            }
        }


        
        System.out.println("\nOUTPUT");
        
        for (int i = 0; i < dictionary.size(); i++) {
            System.out.println(doublet.get(i));
        }
        scan.close();
    }
}
