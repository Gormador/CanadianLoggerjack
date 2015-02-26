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
	 * @param message
	 * @return
	 */
	public abstract String formatError(String message);
	
	/**
	 * Formate un message de type <code>INFO</code>.
	 * @param message
	 * @return
	 */
	public abstract String formatInfo(String message);
	
	/**
	 * Formate un message de type <code>DEBUG</code>.
	 * @param message
	 * @return
	 */
	public abstract String formatDebug(String message);
}
