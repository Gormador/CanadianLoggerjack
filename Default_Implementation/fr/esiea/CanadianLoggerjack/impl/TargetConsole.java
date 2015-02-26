/**
 * 
 */
package fr.esiea.CanadianLoggerjack.impl;

import fr.esiea.CanadianLoggerjack.Target;


/**
 * Displays messages in the console
 *
 */
public class TargetConsole implements Target {
	
	/**
	 * Displays the message in the console
	 * @param message The message that will be display
	 */
	@Override
	public void record(String message) {		
		System.out.println(message);
	}
}
