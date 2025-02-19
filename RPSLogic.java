package rpssimulator;

public class RPSLogic 
{
	static Integer playerWins;
	static String playerValue;
	
	public static void clearSpace() 
	{
		for(int i = 0 ; i < 16 ; i++)
		{
			System.out.println();
		}
		
	}
	
	public static void animation()
	{
		clearSpace();
		System.out.println("        P" + RPSLogic.getPlayerValue() + "                 " + BotAlgorithm.getBotValue()+"B");
		MainRPS.animationSuspensemaker();
		clearSpace();
		System.out.println("         P" + RPSLogic.getPlayerValue() + "               " + BotAlgorithm.getBotValue()+"B");
		MainRPS.animationSuspensemaker();
		clearSpace();
		System.out.println("          P" + RPSLogic.getPlayerValue() + "             " + BotAlgorithm.getBotValue()+"B");
		MainRPS.animationSuspensemaker();
		clearSpace();
		System.out.println("           P" + RPSLogic.getPlayerValue() + "           " + BotAlgorithm.getBotValue()+"B");
		MainRPS.animationSuspensemaker();
		clearSpace();
		System.out.println("            P" + RPSLogic.getPlayerValue() + "         " + BotAlgorithm.getBotValue()+"B");
		MainRPS.animationSuspensemaker();
		clearSpace();
		System.out.println("             P" + RPSLogic.getPlayerValue() + "       " + BotAlgorithm.getBotValue()+"B");
		MainRPS.animationSuspensemaker();
		clearSpace();
		System.out.println("               " + RPSLogic.getPlayerValue() + "     " + BotAlgorithm.getBotValue());
		MainRPS.animationSuspensemaker();
		clearSpace();
		System.out.println("                " + RPSLogic.getPlayerValue() + "   " + BotAlgorithm.getBotValue());
		MainRPS.animationSuspensemaker();
		clearSpace();
		System.out.println("                 " + RPSLogic.getPlayerValue() + " " + BotAlgorithm.getBotValue());
		MainRPS.animationSuspensemaker();
		clearSpace();

		
	}
	public static String getPlayerValue()
	{
		return playerValue;
	}

	public static void setPlayerValue(String playerValue)
	{
		RPSLogic.setPlayerValue(playerValue);
	}

	public static void playerChoice(String playerPick)
	{
		if(playerPick.equals("r"))
		{
			playerValue = "🪨";
		}
		
		if(playerPick.equals("p"))
		{
			playerValue = "📄";
		}
		
		if(playerPick.equals("s"))
		{
			playerValue = "✂️";
		}
		
	}
	
	
	
	public static Integer showdown() // all possible scenarios
	{
	    determineWinner(); // Call the new method to set `playerWins`

	    if (playerWins == 1)
	    {
	        System.out.println("                  " + RPSLogic.getPlayerValue());
	    }
	    if (playerWins == 0)
	    {
	        System.out.println("                  " + BotAlgorithm.getBotValue());
	    }
	    if (playerWins == 2)
	    {
	    	System.out.println("                 " + RPSLogic.getPlayerValue() + " " + BotAlgorithm.getBotValue());
	    }
	    
	    MainRPS.suspensemaker();

	    if(playerWins == 2) // Tie
	    {
	        System.out.println("          Result: It's a Tie!");
	    }
	    
	    if(playerWins == 1 && playerValue.equals("✂️") && BotAlgorithm.getBotValue().equals("📄"))
	    {
	        System.out.println("Result: Scissors Beat Paper, PLAYER Wins!");
	    }
	    
	    if(playerWins == 1 && playerValue.equals("🪨") && BotAlgorithm.getBotValue().equals("✂️"))
	    {
	        System.out.println("Result: Rock Beats Scissors, PLAYER Wins!");
	    }
	    
	    if(playerWins == 1 && playerValue.equals("📄") && BotAlgorithm.getBotValue().equals("🪨"))
	    {
	        System.out.println("Result: Paper Beats Rock, PLAYER Wins!");
	    }

	    if(playerWins == 0 && BotAlgorithm.getBotValue().equals("✂️") && playerValue.equals("📄"))
	    {
	        System.out.println("Result: Scissors Beat Paper, BOT Wins!");
	    }
	    
	    if(playerWins == 0 && BotAlgorithm.getBotValue().equals("🪨") && playerValue.equals("✂️"))
	    {
	        System.out.println("Result: Rock Beats Scissors, BOT Wins!");
	    }
	    
	    if(playerWins == 0 && BotAlgorithm.getBotValue().equals("📄") && playerValue.equals("🪨"))
	    {
	        System.out.println("Result: Paper Beats Rock, BOT Wins!");
	    }

	    return playerWins;
	}

	public static void determineWinner() // New method to set `playerWins`
	{
	    if(playerValue.equals("🪨") && BotAlgorithm.getBotValue().equals("🪨")
	            || playerValue.equals("📄") && BotAlgorithm.getBotValue().equals("📄")
	            || playerValue.equals("✂️") && BotAlgorithm.getBotValue().equals("✂️"))
	    {
	        playerWins = 2; // 2 is a tie
	    }

	    if(playerValue.equals("✂️") && BotAlgorithm.getBotValue().equals("📄"))
	    {
	        playerWins = 1;
	    }

	    if(playerValue.equals("🪨") && BotAlgorithm.getBotValue().equals("✂️"))
	    {
	        playerWins = 1;
	    }

	    if(playerValue.equals("📄") && BotAlgorithm.getBotValue().equals("🪨"))
	    {
	        playerWins = 1;
	    }

	    if(BotAlgorithm.getBotValue().equals("✂️") && playerValue.equals("📄"))
	    {
	        playerWins = 0;
	    }

	    if(BotAlgorithm.getBotValue().equals("🪨") && playerValue.equals("✂️"))
	    {
	        playerWins = 0;
	    }

	    if(BotAlgorithm.getBotValue().equals("📄") && playerValue.equals("🪨"))
	    {
	        playerWins = 0;
	    }
	}
	
}