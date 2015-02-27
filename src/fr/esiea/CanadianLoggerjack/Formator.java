/**
 * 
 */
package fr.esiea.CanadianLoggerjack;

/**
 * Message formator
 *
 * @author M. Bougeret &amp; L. Cousi &amp; G. Philippot
 */
public abstract class Formator {
	
	/**
	 * The current logger name.
	 */
	protected String loggerName;
	
	/**
	 * Default constructor.
	 *
	 * @param loggerName The current logger in use.
	 */
	public Formator(String loggerName){
		
	}
	
	/**
	 * Formats a message of type <code>ERROR</code>.
	 * 
	 * @param message The message that will be formated.
	 * @return The formated string
	 */
	public abstract String formatError(String message);
	
	/**
	 * Formats a message of type  <code>INFO</code>.
	 * 
	 * @param message The message that will be formated.
	 * @return The formated string
	 */
	public abstract String formatInfo(String message);
	
	/**
	 * Formats a message of type  <code>DEBUG</code>.
	 * 
	 * @param message The message that will be formated.
	 * @return The formated string
	 */
	public abstract String formatDebug(String message);
}
