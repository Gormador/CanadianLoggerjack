/**
 * 
 */
package fr.esiea.CanadianLoggerjack;

/**
 * Message formator
 *
 */
public abstract class Formator {
	
	@SuppressWarnings("unused")
	protected String loggerName;
	
	/**
	 * Default constructor.
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
