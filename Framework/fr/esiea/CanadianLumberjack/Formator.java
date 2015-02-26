/**
 * 
 */
package fr.esiea.CanadianLumberjack;

/**
 * Message formator
 *
 */
public abstract interface Formator {

	/**
	 * Formats a message of type <code>ERROR</code>.
	 * @param message The message that will be formated.
	 * @return The formated string
	 */
	public abstract String formatError(String message);
	
	/**
	 * Formats a message of type  <code>INFO</code>.
	 * @param message The message that will be formated.
	 * @return The formated string
	 */
	public abstract String formatInfo(String message);
	
	/**
	 * Formats a message of type  <code>DEBUG</code>.
	 * @param message The message that will be formated.
	 * @return The formated string
	 */
	public abstract String formatDebug(String message);
}
