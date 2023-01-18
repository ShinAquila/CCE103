package OtherTest;
import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numbers[] = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a Number: ");
            numbers[i] = scan.nextInt();
        }
        System.out.println();

        System.out.printf("%4s \t","Even Numbers: ");
        String sep = "";
        for (int i : numbers) {
            if (i % 2 == 0) {
                System.out.print(sep+i);
                sep = ", ";
            }
        }
        System.out.println();

        System.out.printf("%4s \t","Odd Numbers: ");
        sep = "";
        for (int i : numbers) {
            if (i % 2 != 0) {
                System.out.print(sep+i);
                sep = ", ";
            }
        }
        System.out.println();

        scan.close();
    }
}