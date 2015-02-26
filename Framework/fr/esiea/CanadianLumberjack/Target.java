/**
 * 
 */
package fr.esiea.CanadianLumberjack;

/**
 * Interface Cible
 *
 * Toute cible doit respecter cette interface.
 */
public interface Target {

	
	/**
	 * This method must record the message on the medium.
	 * @param message The message to be recorded.
	 */
	public abstract void record(String message);
	
}
