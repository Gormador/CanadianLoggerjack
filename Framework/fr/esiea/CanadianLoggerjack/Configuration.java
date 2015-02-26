/**
 * 
 */
package fr.esiea.CanadianLoggerjack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Properties;

import fr.esiea.CanadianLoggerjack.impl.TargetConsole;

/**
 * Configure a <code>LoggerFactory</code>
 *
 *@see LoggerFactory
 */
public class Configuration {

	
	@SuppressWarnings("rawtypes") 
	HashMap<Class, LinkedList<Target>> targets;
	
	@SuppressWarnings("rawtypes")
	HashMap<Class, ErrorLevel> errLevels;
	
	@SuppressWarnings("rawtypes")
	HashMap<Class, Formator> layouts;
	
	/**
	 * Constructor with default parameters.
	 * 
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
	 * TODO couplé à l'implémentation de la lecture des properties
	 * 
	 * @param configFile The configuration file.
	 * @throws FileNotFoundException Throws an exception if it is raised when opening the file.
	 */
	public Configuration(File configFile) throws FileNotFoundException /* TODO, BadConfigException */{
		
		Properties props = new Properties();
		InputStream is = null;
		
		is = new FileInputStream(configFile);
		
		// TODO Load properties  
		
		try {
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
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
	public void addTarget(Class sClass, Target target){
		
		if(targets.containsKey(sClass)){
			targets.get(sClass).add(target);
		}
		else{
			LinkedList<Target> l = new LinkedList<Target>();
			l.add(target);
			targets.put(sClass, l);
		}
	}
	
	/**
	 * Set the error level for this class.
	 * <br> If an error level was already specified, it will be overwritten by the new value.
	 * 
	 * @param sClass The specified class
	 * @param errorLevel The errorLevel
	 * @see ErrorLevel
	 */
	@SuppressWarnings("rawtypes")
	public void setLevel(Class sClass, ErrorLevel errorLevel){
		errLevels.put(sClass, errorLevel);	
	}
	
	/**
	 * Set the layout for this class.
	 * <br> If a layout was already specified, it will be overwritten by the new value.
	 * 
	 * @param sClass The specified class.
	 * @param layout The layout that will be applied on all targets.
	 */
	@SuppressWarnings("rawtypes")
	public void setLevel(Class sClass, Formator layout){
		layouts.put(sClass, layout);	
	}
	
	
	
}
