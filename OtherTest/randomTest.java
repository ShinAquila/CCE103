package OtherTest;
import java.util.Random;

public class randomTest {
    public static void main(String[] args) {
        Random randUwU = new Random();

        for (int i = 0; i < 10; i++) {
            int number = randUwU.nextInt(3)+1;
            System.out.println("Picked: "+number);
        }
    }
}
