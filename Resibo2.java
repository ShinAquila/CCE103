import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Resibo2 {
    public static void main(String[] args) {
        DateTimeFormatter date = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDateTime dateToday = LocalDateTime.now();

        Scanner scan = new Scanner(System.in);

        System.out.println("\t\tPURCHASE RECEIPT SYSTEM \n \t\t INPUT DETAILS BELOW ");
        System.out.println("*".repeat(53));
        System.out.print("Enter Cashier Name: ");
        String cashier = scan.next();

        System.out.print("Enter O.R No.: ");
        int OR = scan.nextInt();
        System.out.println("*".repeat(53));

        System.out.print("Enter Number of Items: ");
        int item = scan.nextInt();
        System.out.println("*".repeat(53));

        String name[] = new String[item];
        int price[] = new int[item];
        int quantity[] = new int[item];
        double total[] = new double[item];
        double subtotal = 0;
        double vat = 0;

        for (int i = 0; i < item; i++) {

            System.out.print("Enter Item Name: ");
            name[i] = scan.next();

            System.out.print("Enter Item Price: ");
            price[i] = scan.nextInt();

            System.out.print("Enter Item Quantity: ");
            quantity[i] = scan.nextInt();

            System.out.println("-".repeat(53));
            total[i] = price[i] * quantity[i];
            subtotal += total[i];

        }

        int customer1 = 0;
        double output = 0;

        vat = subtotal * 0.05;
        output = vat + subtotal;
        
        System.out.println("TOTAL PAYMENT: \t\t\t\t Php " + output);
        System.out.println("*".repeat(53));

        do {
            System.out.print("Enter Customer Payment: \t\t Php ");
            customer1 = scan.nextInt();
        } while (customer1 < output);
        double change = customer1 - output;

        System.out.println("\n\n\t\tGaisano Grand Mall");
        System.out.println("\t   Mc Arthur Highway, Digos City");
        System.out.println("\t  Tel. #: 553-2847 Fax:679652382");
        System.out.println("\t     GST Reg. No. 00023648294");
        System.out.println("\t\tRCB: 529873290\n");

        System.out.println("\n\t       PURCHASE RECEIPT");

        System.out.println("\nCashier Name: " + cashier);
        System.out.print("Date: " + date.format(dateToday));
        System.out.print("\t\tO.R No. " + OR);

        System.out.println("\n\nQty. \tItem/s \t\t\t Price/s");
        System.out.println("-".repeat(53));
        for (int i = 0; i < item; i++) {
            System.out.println(" "+quantity[i] + "\t" + name[i] + "\t\t\t   " + price[i]);

        }

        System.out.println("*".repeat(53));
        System.out.println("SUBTOTAL\t\t\t Php " + subtotal);
        System.out.println("VAT\t\t\t\t Php " + vat);
        System.out.println("\nTOTAL\t\t\t\t Php " + output);
        System.out.println("\nCASH\t\t\t\t Php " + customer1);
        System.out.printf("%s %.2f \n", "CHANGE\t\t\t\t Php" ,change);
        System.out.println("*".repeat(53));

        System.out.println("\t THANK YOU FOR SHOPPING!");

        scan.close();
    }
}
