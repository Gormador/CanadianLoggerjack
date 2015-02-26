/**
 * 
 */
package fr.esiea.CanadianLumberjack;

/**
 * Classe Logger.
 * Seul un <code>LoggerFactory</code> peut instancier cette classe.
 * 
 * La hiérarchie des niveaux d'erreur (du moins au plus détaillé) : <code>ERROR</code>, <code>DEBUG</code>, <code>INFO</code>. 
 */
public class Logger {
	
	
	
	Logger(/* A DEFINIR */){ //pas de public/private ou autre = default => seul le factory (du même package) peut appeler le constructeur.
		//A DEFINIR
	}
	
	
	/**
	 * Log an <code>ERROR</code> message
	 * @param message The message to be logged
	 */
	public void error(String message){
		/* A DEFINIR */
	}
	
	/**
	 * Log a <code>DEBUG</code> message
	 * @param message The message to be logged
	 */
	public void debug(String message){
		/* A DEFINIR */
		
	}
	
	
	/**
	 * Log an <code>INFO</code> message
	 * @param message The message to be logged
	 */
	public void info(String message){
		/* A DEFINIR */
	}
}
