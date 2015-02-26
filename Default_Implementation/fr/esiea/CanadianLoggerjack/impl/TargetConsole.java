/**
 * 
 */
package fr.esiea.CanadianLoggerjack.impl;

import fr.esiea.CanadianLoggerjack.Target;


/**
 * Displays messages in the console.
 * <br> This is the default target for a <code>Logger</code> when nothing is specified in the <code>Configuration</code>.
 *
 * @see Configuration
 * @see Target
 */
public class TargetConsole implements Target {
	
	
	public TargetConsole() {
		
	}
	
	/**
	 * Displays the message in the console
	 * @param message The message that will be display
	 */
	@Override
	public void record(String message) {		
		System.out.println(message);
	}
}
