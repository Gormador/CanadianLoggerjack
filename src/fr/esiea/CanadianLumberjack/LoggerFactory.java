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
	 * Instancie un LoggerFactory avec la configuration pass�e en param�tre.
	 * @param config
	 * @param classe
	 */
	public LoggerFactory(Configuration config){
		
	}
	
	/**
	 * Instancie un LoggerFactory avec la configuration contenue dans le fichier properties pass� en param�tre
	 * @param config
	 * @param classe
	 */
	public LoggerFactory(File configFile)/* throws FileException, BadConfigException */{
		/* A DEFINIR */
		
		/* le fileexception est � red�finir (il faut jeter une exception s'il y a un souci avec le fichier)
		 * et le badconfigexceptin est � cr�er */
		
		 
	}
	
	
	
	/**
	 * Retourne le <code>Logger</code>, configur� pour la classe donn�e en param�tre selon les configurations.
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
