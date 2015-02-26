/**
 * 
 */
package fr.esiea.CanadianLoggerjack;

/**
 * Classe Logger.
 * Seul un <code>LoggerFactory</code> peut instancier cette classe.
 * 
 * La hirarchie des niveaux d'erreur (du moins au plus d�taill�) : <code>ERROR</code>, <code>DEBUG</code>, <code>INFO</code>. 
 */
public class Logger {
	
	
	
	// pas de public/private ou autre = default => seul le factory (du m�me package) peut appeler le constructeur.
	
	Logger(/* A DEFINIR */){
		// TODO � impl�menter
	}
	
	
	/**
	 * Log an <code>ERROR</code> message
	 * 
	 * @param message The message to be logged
	 */
	public void error(String message){
		// TODO � impl�menter 
	}
	
	/**
	 * Log a <code>DEBUG</code> message
	 * 
	 * @param message The message to be logged
	 */
	public void debug(String message){
		// TODO � impl�menter
	}
	
	
	/**
	 * Log an <code>INFO</code> message
	 * 
	 * @param message The message to be logged
	 */
	public void info(String message){
		// TODO � impl�menter
	}
}
