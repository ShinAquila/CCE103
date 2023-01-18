package RandomProg;
import java.util.Random;
import java.util.Scanner;

public class RockPaperSci {
    static int playerScore = 0;
    static int computerScore = 0;

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("1 = Rock | 2 = Paper | 3 = Scissors");

        boolean contLoop = true;
        
        do {
            System.out.print("Player Turn: ");
            int playerTurn = scan.nextInt();
            String playPicked = playerTurn==1 ? "Rock" : playerTurn==2 ? "Paper" : playerTurn==3 ? "Scissors":"Invalid";
            System.out.println("Player picked: "+playPicked);
    

            int compTurn = random.nextInt(3)+1;
            String compPicked = compTurn==1 ? "Rock" : compTurn==2 ? "Paper" : compTurn==3 ? "Scissors":"Invalid";
            System.out.println("Computer picked: "+compPicked);
    
            System.out.println();
            winConditions(playerTurn, compTurn);

            if (playerScore == 5 || computerScore == 5) {
                contLoop = false;
            }

            System.out.println("Player Score "+playerScore+" | Computer Score "+computerScore);
            System.out.println("-".repeat(33));
        } while (contLoop);

        if (playerScore == 5) {
            System.out.println("Player Wins!");
        } else if (computerScore == 5) {
            System.out.println("Computer Wins!");
        }

        scan.close();
    }

    public static void winConditions(int player, int computer) {
        if (player==1 && computer==3 || player==2 && computer==1 || player==3 && computer==2) {
            System.out.println("Player Scored!");
            playerScore+=1;
        } else if (computer==1 && player==3 || computer==2 && player==1 || computer==3 && player==2) {
            System.out.println("Computer Scored!");
            computerScore+=1;
        } else {
            System.out.println("Draw!");
        }
    }
}
