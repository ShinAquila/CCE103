import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Random rand = new Random();
        
        for(int i = 0; i < 30; i++){
            int number = rand.nextInt(5)*2+2;
            
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
