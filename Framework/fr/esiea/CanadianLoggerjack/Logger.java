/**
 * 
 */
package fr.esiea.CanadianLoggerjack;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static fr.esiea.CanadianLoggerjack.ErrorLevel.*;

/**
 * Classe Logger.
 * Seul un <code>LoggerFactory</code> peut instancier cette classe.
 * 
 * La hirarchie des niveaux d'erreur (du moins au plus détaillé) : <code>ERROR</code>, <code>DEBUG</code>, <code>INFO</code>. 
 */
public class Logger {
	
	private Formator formator;
	private List<Target> targets;
	private ErrorLevel errLevel;
	
	
	
	
	Logger(Formator formator, List<Target> targets, ErrorLevel errLevel){
		this.formator = formator;
		this.targets = targets;
		this.errLevel = errLevel;
	}
	
	
	/**
	 * Log an <code>ERROR</code> message
	 * 
	 * @param message The message to be logged
	 */
	public void error(String message){
		// TODO à implémenter 
	}
	
	/**
	 * Log a <code>DEBUG</code> message
	 * 
	 * @param message The message to be logged
	 */
	public void debug(String message){
		// TODO à implémenter
	}
	
	
	/**
	 * Log an <code>INFO</code> message
	 * 
	 * @param message The message to be logged
	 */
	public void info(String message){
		// TODO à implémenter
	}
}
