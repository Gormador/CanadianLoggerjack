/**
 * 
 */
package fr.esiea.CanadianLumberjack;

/**
 * Formateur de message.
 *
 */
public abstract interface Formateur {

	/**
	 * Formate un message de type <code>ERROR</code>.
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
