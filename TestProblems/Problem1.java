package TestProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> arrOutput = new ArrayList<Integer>();

        Double limit = Math.pow(10, 101);
        int counter = 0;
        int m = 1;
        int n = 1;

        System.out.println("Example: 2 2\n");
        System.out.println("INPUT");
        while (counter < limit && (m > 0 && n > 0)) {
            String number = scan.nextLine();
            String numSplit[] = number.split(" ");

            m = Integer.parseInt(numSplit[0]);
            n = Integer.parseInt(numSplit[1]);

            if (m <= 0 && n <= 0) {
                double outP = Math.pow(m, n);

                String outPtoString = String.valueOf(outP);
                int indexOfoutP = outPtoString.indexOf(".");

                String strFin = outPtoString.substring(indexOfoutP - 1);
                outP = Double.parseDouble(strFin);

                arrOutput.add((int) outP);

                counter++;
            }
        }
        System.out.println();

        System.out.println("OUTPUT");
        for (int i = 0; i < counter; i++) {
            System.out.println(arrOutput.get(i));
        }
        scan.close();

    }
}
