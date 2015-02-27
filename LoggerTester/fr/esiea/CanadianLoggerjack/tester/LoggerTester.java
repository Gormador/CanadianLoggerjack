package fr.esiea.CanadianLoggerjack.tester;

public class LoggerTester
{

	public static void main(String[] args)
	{
		System.out.println("Testing default behaviour.");
		new ConsoleTester();
		
		System.out.println("\nTesting log to file.");
		new FileTester();
	}

}
