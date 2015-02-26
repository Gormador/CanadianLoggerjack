/**
 * 
 */
package fr.esiea.CanadianLoggerjack;

import java.util.HashMap;
import java.util.LinkedList;


/**
 * 
 *
 */
public class LoggerFactory {
	
	@SuppressWarnings("rawtypes")
	private HashMap<Class, LinkedList<Target>> targets;
	@SuppressWarnings("rawtypes")
	private HashMap<Class, ErrorLevel> errLevels;
	@SuppressWarnings("rawtypes")
	private HashMap<Class, Formator> layouts;
	
	/**
	 * Instantiate a <code>LoggerFactory</code> with the parameters specified in the properties file.
	 * 
	 * @param config The configuration for the LoggerFactory
	 * @see Configuration
	 */
	public LoggerFactory(Configuration config){
		this.targets = new HashMap<Class, LinkedList<Target>>(config.targets);
		this.errLevels = new HashMap<Class, ErrorLevel>(config.errLevels);
		this.layouts = new HashMap<Class, Formator>(config.layouts);
	}
	
	
	
	
	
	/**
	 * Instantiate a <code>Logger</code>, configured for the specified class according <code>Configuration</code> settings.
	 * 
	 * 
	 * @param sClass The specified class
	 * @return A logger instantiated for the specified class
	 */
	@SuppressWarnings("rawtypes")
	public Logger getLogger(Class sClass){
		
		// TODO à implémenter
		
		return null;
	}
	
}
