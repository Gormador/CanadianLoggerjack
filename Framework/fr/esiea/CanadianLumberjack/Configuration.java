/**
 * 
 */
package fr.esiea.CanadianLumberjack;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Configure a <code>LoggerFactory</code>
 *
 *@see LoggerFactory
 */
public class Configuration {

	
	@SuppressWarnings("rawtypes")
	private HashMap<Class, LinkedList<Target>> targets;
	
	/**
	 * Constructor with default parameters.
	 * <br>Default parameters are:
	 * <br>For each class :
	 * <br>errorlevel: <code>ERROR</code>
	 * <br>target: <code>TargetConsole</code>
	 *  
	 *  @see TargetConsole
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
	 * Using it for the first time overwrite the default value
	 * 
	 * 
	 * @param sClass The specified class
	 * @param target The target to add to the specified class
	 */
	@SuppressWarnings("rawtypes")
	public void ajouterCible(Class sClass, Target target){
		
		if(targets.containsKey(sClass)){
			targets.get(sClass).add(target);
		}
		else{
			LinkedList<Target> l = new LinkedList<Target>();
			l.add(target);
			targets.put(sClass, l);
		}
			/* A DEFINIR */
	}
}
