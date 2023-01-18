package RandomProg;
import java.util.Random;
import java.util.Scanner;

public class RPS {
    static int playerScore = 0;
    static int computerScore = 0;
    static String winName = "";
    static boolean contLoop = true;

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("1 = Rock | 2 = Paper | 3 = Scissors");

        
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

            checkWin();

            System.out.println("Player Score "+playerScore+" | Computer Score "+computerScore);
            System.out.println("-".repeat(33));
        } while (contLoop);

        System.out.println(winName+ " Wins!");

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
    
    public static void checkWin(){
        if (playerScore>=3 && computerScore<3) {
            contLoop = false;
            winName = "Player";
        } else if (computerScore>=3 && playerScore<3) {
            contLoop = false;
            winName = "Computer";
        }
    }
}
