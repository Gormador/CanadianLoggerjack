/**
 * 
 */
package fr.esiea.CanadianLumberjack;

import java.io.File;

/**
 * Configuration Class
 *
 */
public class Configuration {

	/**
	 * Constructor with default values
	 * Default parameters are:
	 * For every class, errorlevel <code>ERROR</code>, target <code>TargetConsole</code>
	 *  
	 */
	public Configuration(){
		
	}
	
	/**
	 * Uses the configuration specified in the properties file in parameter
	 * 
	 * DOCUMENTATION DU FICHIER PROPERTIES :
	 * à faire
	 * 
	 * @param configFile
	 */
	public Configuration(File configFile)/* throws FileException, BadConfigException */{
		/* A DEFINIR */
		
		/* le fileexception est à redéfinir (il faut jeter une exception s'il y a un souci avec le fichier)
		 * et le badconfigexceptin est à créer */
		
		 
	}
	
	/**
	 * Add a target to a class
	 * Using it for the first time crushed the default value
	 * 
	 * @param classe
	 * @param cible
	 */
	public void ajouterCible(Class classe, Target cible){
		/* A DEFINIR */
	}
}
