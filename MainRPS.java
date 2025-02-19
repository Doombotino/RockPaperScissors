package rpssimulator;
import java.util.Scanner;

public class MainRPS 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in); // Create scanner once
        String newGameConfirmation;

        do {
            System.out.println("Rock, Paper, Scissors, SHOOT!");
            System.out.println("[r-🪨, p-📄, s-✂️]");
            
            String playerPick = choiceSender(scanner); // Get user input
            RPSLogic.playerChoice(playerPick);
            System.out.println("You picked: " + RPSLogic.getPlayerValue());

            BotAlgorithm.getBotChoiceInt();
            BotAlgorithm.getBotChoiceString();
            System.out.println("THE BOT HAS MADE ITS CHOICE");

            suspensemaker();
            System.out.println("Player: " + RPSLogic.getPlayerValue() + "       ROCK...       " + "  BOT ");
            suspensemaker();
            System.out.println("Player: " + RPSLogic.getPlayerValue() + "       PAPER...      " + "  BOT ");
            suspensemaker();
            System.out.println("Player: " + RPSLogic.getPlayerValue() + "       SCISSORS...     " + "BOT ");
            suspensemaker();
            System.out.println("Player: " + RPSLogic.getPlayerValue() + "       SHOOT!!!!    " + BotAlgorithm.getBotValue() + " BOT:");
            suspensemaker();

            RPSLogic.determineWinner();
            RPSLogic.animation();
            RPSLogic.showdown();

            System.out.println("New Game? [y/n]");
            System.out.println();
            newGameConfirmation = choiceSender(scanner); // Use the same scanner
        }
        while (newGameConfirmation.equalsIgnoreCase("y"));

        scanner.close(); // Close scanner after loop ends
    }

    // ✅ Pass Scanner as parameter to avoid multiple instances
    public static String choiceSender(Scanner scanner)
    {
        return scanner.nextLine();
    }

    public static void suspensemaker() { 
        try {
            Thread.sleep(1500); // Pause for suspense
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void animationSuspensemaker() { 
        try {
            Thread.sleep(315); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
