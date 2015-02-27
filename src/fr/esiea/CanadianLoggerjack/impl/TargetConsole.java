/**
 * 
 */
package fr.esiea.CanadianLoggerjack.impl;

import fr.esiea.CanadianLoggerjack.Target;


/**
 * Displays messages in the console.
 * <br> This is the default target for a <code>Logger</code> when nothing is specified in the <code>Configuration</code>.
 *
 * @author M. Bougeret &amp; L. Cousi &amp; G. Philippot
 *
 * @see fr.esiea.CanadianLoggerjack.Configuration
 * @see Target
 *
 */
public class TargetConsole implements Target {
	
	
	/**
	 * The default constructor. Dummy.
	 */
	public TargetConsole() {
		
	}
	
	/**
	 * Displays the message in the console
	 * 
	 * @param message The message to display
	 */
	@Override
	public void record(String message) {		
		System.out.println(message);
	}
}
