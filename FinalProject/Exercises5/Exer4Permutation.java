package Exercises5;
import java.util.*;

public class Exer4Permutation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("[ ! ] To get the Permutation [ ! ]");
        System.out.println("[ - ] Enter the # of Items separated by a comma then the # of ways it's ordered as demonstrated below [ - ]\n");
        
        
        boolean isError = false;
        do {
            try {
                System.out.println("-".repeat(22)+ "<[ INPUT ]>" +"-".repeat(22)+"\n");
                System.out.println("(# of Items), (# ordered ways)".indent(20));
                System.out.print("[+] Enter an Input: ");
                String input = scan.nextLine();
        
                String factSplit[] = input.split(",");
                int fact1 = Integer.parseInt(factSplit[0].replaceAll("\\s+", ""));
                int limit = Integer.parseInt(factSplit[1].replaceAll("\\s+", ""));
                
                int fact1Total = 1;
                for (int i = 1; i <= fact1; i++) {
                    fact1Total *= i;
                }
    
                int fact2 = fact1 - limit;
                int fact2Total = 1;
                for (int i = 1; i <= fact2; i++) {
                    fact2Total *= i;
                }
    
                int permutation = fact1Total/fact2Total;
    
                System.out.println("\n"+"-".repeat(22)+ "<[ OUTPUT ]>" +"-".repeat(21));
                System.out.println("\n[O] The permutation of "+input+" is: "+permutation);
                isError = false;
            } catch (Exception e) {
                System.out.println("<!> The Input is not a number and/or incomplete <!>\n");
                isError = true;
            }
            
        } while (isError == true);

        scan.close();
    }
}
