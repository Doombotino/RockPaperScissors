package rpssimulator;
import java.util.Random;
public class BotAlgorithm
{
	static int botChoice = getBotChoiceInt();
	public static int getBotChoice()
	{
		return botChoice;
	}

	public static void setBotChoice(int botChoice)
	{
		BotAlgorithm.botChoice = botChoice;
	}

	static String botValue;
	public static String getBotValue()
	{
		return botValue;
	}

	public static void setBotValue(String botValue)
	{
		BotAlgorithm.botValue = botValue;
	}

	public static Integer getBotChoiceInt()
	{
		Random random = new Random();
		int choice = random.nextInt(3);
		return choice;
	}
	
	public static String getBotChoiceString()
	{
		if(botChoice == 0)
		{
			botValue = "🪨";
		}
		
		if(botChoice == 1)
		{
			botValue = "📄";
		}
		
		if(botChoice == 2)
		{
			botValue = "✂️";
		}
		
		return botValue;
	}
}
