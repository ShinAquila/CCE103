package RandomProg;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RockPaperSci {
    static int playerScore = 0;
    static int computerScore = 0;
    static boolean contLoop = true;
    static boolean invalid = true;
    static String winName = "";

    public static void main(String[] args) throws InterruptedException{
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("1 = Rock | 2 = Paper | 3 = Scissors");
            System.out.println("R = Rock | P = Paper | S = Scissors\n");

            System.out.println("-".repeat(37));
            System.out.println("| Player Score "+playerScore+" | Computer Score "+computerScore+ " |");
            System.out.println("-".repeat(37));

            String playerTurn = "";
            do {
                playerTurn = playerTurn(scan);
            } while (invalid);

            int compTurn = computerTurn(random);
    
            System.out.println();
            winConditions(playerTurn, compTurn);

            checkWin();
        } while (contLoop);

        System.out.println("-".repeat(37));
        System.out.println("| Player Score "+playerScore+" | Computer Score "+computerScore+ " |");
        System.out.println("-".repeat(37));

        System.out.printf("\n %s %s %s %s \n","[",winName,"Wins!","]");

        scan.close();
    }

    public static String playerTurn(Scanner scan) {
        System.out.print("Player Turn: ");
        String playerTurn = scan.nextLine();
        System.out.println();

        String playPicked = "";
        if (playerTurn.equals("1") || playerTurn.equalsIgnoreCase("R")) {
            playPicked = "Rock";
            invalid = false;
        } else if (playerTurn.equals("2") || playerTurn.equalsIgnoreCase("P")) {
            playPicked = "Paper";
            invalid = false;
        } else if (playerTurn.equals("3") || playerTurn.equalsIgnoreCase("S")) {
            playPicked = "Scissors";
            invalid = false;
        } else{
            playPicked = "Invalid. Try Again...";
            invalid = true;
        }

        System.out.println("Player picked: "+playPicked);
        return playerTurn;
    }

    public static int computerTurn(Random random) {
        int compTurn = random.nextInt(3)+1;

        String compPicked = compTurn==1 ? "Rock" : compTurn==2 ? "Paper" : compTurn==3 ? "Scissors":"Invalid";
        System.out.println("Computer picked: "+compPicked);
        return compTurn;
    }

    public static void winConditions(String player, int computer) throws InterruptedException {
        if ((player.equals("1") || player.equalsIgnoreCase("R")) && computer==3 ||
            (player.equals("2") || player.equalsIgnoreCase("P")) && computer==1 ||
            (player.equals("3") || player.equalsIgnoreCase("S")) && computer==2){

            System.out.println("-----Player Scored!-----");
            playerScore++;
        } else if (computer==1 && (player.equals("3") || player.equalsIgnoreCase("S")) || 
                    computer==2 && (player.equals("1") || player.equalsIgnoreCase("R"))|| 
                    computer==3 && (player.equals("2")|| player.equalsIgnoreCase("P"))){

            System.out.println("----Computer Scored!----");
            computerScore++;
        } else {
            System.out.println("----------Draw!---------");
        }

        Thread.sleep(700);
    }

    public static void checkWin(){
        if (playerScore==5) {
            contLoop = false;
            winName = "Player";
        } else if (computerScore==5) {
            contLoop = false;
            winName = "Computer";
        } else {
            clear();
        }
    }

    public static void clear(){
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime();
            }
        } catch (IOException | InterruptedException ex) {}
    }
}
