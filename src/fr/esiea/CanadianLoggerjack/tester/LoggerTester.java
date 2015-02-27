package fr.esiea.CanadianLoggerjack.tester;

/**
 * Main logger tester class.
 * 
 * @author M. Bougeret &amp; L. Cousi &amp; G. Philippot
 *
 */
public class LoggerTester
{

	/**
	 * Init.
	 * 
	 * @param args Launch parameters. (Unused.)
	 */
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
