/**
 * 
 */
package fr.esiea.CanadianLoggerjack;

/**
 * Each Target must implement this interface.
 * 
 */
public interface Target {

	
	
	/**
	 * This method record the message on the medium.
	 *
	 * @param message The message to be recorded.
	 */
	public abstract void record(String message);
	
}
