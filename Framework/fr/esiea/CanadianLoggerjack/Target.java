/**
 * 
 */
package fr.esiea.CanadianLoggerjack;

import java.util.Properties;

/**
 * Each Target must implement this interface.
 * 
 */
public interface Target {

	
	
	/**
	 * This method must record the message on the medium.
	 *
	 * @param message The message to be recorded.
	 */
	public abstract void record(String message);
	
}
