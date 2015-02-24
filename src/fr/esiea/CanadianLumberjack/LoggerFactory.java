/**
 * 
 */
package fr.esiea.CanadianLumberjack;

import java.io.File;

/**
 * 
 *
 */
public class LoggerFactory {
	
	/**
	 * Instancie un LoggerFactory avec la configuration passée en paramètre.
	 * @param config
	 * @param classe
	 */
	public LoggerFactory(Configuration config){
		
	}
	
	/**
	 * Instancie un LoggerFactory avec la configuration contenue dans le fichier properties passé en paramètre
	 * @param config
	 * @param classe
	 */
	public LoggerFactory(File configFile)/* throws FileException, BadConfigException */{
		/* A DEFINIR */
		
		/* le fileexception est à redéfinir (il faut jeter une exception s'il y a un souci avec le fichier)
		 * et le badconfigexceptin est à créer */
		
		 
	}
	
	
	
	/**
	 * Retourne le <code>Logger</code>, configuré pour la classe donnée en paramètre selon les configurations.
	 * 
	 * 
	 * @param classe
	 * @return
	 */
	public Logger getLogger(Class classe){
		
		/* A DEFINIR */
		return null;
	}
	
}
