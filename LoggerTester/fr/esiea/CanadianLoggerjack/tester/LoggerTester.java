package fr.esiea.CanadianLoggerjack.tester;

public class LoggerTester
{

	public static void main(String[] args)
	{
		System.out.println("Testing default behaviour.");
		new ConsoleTester();
		
		System.out.println("\nTesting log to file.");
		new FileTester();
		
		System.out.println("\nTesting roll log to file.");
		new RolloverFileTester();
		
		System.out.println("\nTesting with custom config.");
		new PropertiesTester();
	}

}
