/**
 * 
 */
package fr.esiea.CanadianLumberjack;


/**
 * Displays messages in the console
 *
 */
public class TargetConsole implements Target {

	/* (non-Javadoc)
	 * @see fr.esiea.CanadianLumberjack.Cible#record(java.lang.String)
	 */
	
	/**
	 * Displays the message in the console
	 * @param message The message that will be display
	 */
	@Override
	public void record(String message) {		
		System.out.println(message);
	}
}
