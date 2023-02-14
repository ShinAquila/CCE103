package OtherTest;
import java.util.Random;

public class randomTest {
    public static void main(String[] args) {
        Random randUwU = new Random();

        for (int i = 0; i < 100; i++) {
            int number = randUwU.nextInt(10)+1;
            System.out.printf("%10d",number);
        }
    }
}
