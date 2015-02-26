/**
 * 
 */
package fr.esiea.CanadianLoggerjack;


/**
 * 
 *
 */
public class LoggerFactory {
	
	// TODO Ajouter attribut de classe privé pour stocker configuration
	
	
	/**
	 * Instantiate a <code>LoggerFactory</code> with the parameters specified in the properties file.
	 * 
	 * @param config The configuration for the LoggerFactory
	 * @see Configuration
	 */
	public LoggerFactory(Configuration config){
		//TODO après implémentation de la lecture des propriétés
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
