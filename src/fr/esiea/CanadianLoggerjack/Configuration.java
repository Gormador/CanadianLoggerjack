/**
 * 
 */
package fr.esiea.CanadianLoggerjack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
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
	@SuppressWarnings("rawtypes")
	public Configuration(){
		targets = new HashMap<Class, LinkedList<Target>>();
		errLevels = new HashMap<Class, ErrorLevel>();
		layouts = new HashMap<Class, Formator>();
	}
	
	/**
	 * Uses the configuration specified in the properties file in parameter.
	 * 
	 * HOW TO BUILD THE .properties FILE
	 * See the Default_Implementation/resources/loggerConfig.properties file for details
	 * 
	 * 
	 * @param configFile The configuration file.
	 * @throws InvalidConfigurationException If something goes wrong while parsing the config file, or instantiating with the specified parameters.
	 * @throws IOException If a problem occurs while reading the config file.
	 * @throws ClassNotFoundException If the specified class in the config file is not found  
	 * @throws SecurityException Sometimes, you will not be able to instantiate a new class
	 * @throws NoSuchMethodException This exception is raised when there is a bad implementation 
	 * @throws InvocationTargetException This exception is raised when there is a bad implementation
	 * @throws IllegalArgumentException This exception is raised when there is a bad implementation
	 * @throws IllegalAccessException This exception is raised when there is a bad implementation
	 * @throws InstantiationException This exception is raised when there is a bad implementation
	 */
	public Configuration(File configFile) throws InvalidConfigurationException, IOException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException   {
		
		this();
		
		Properties props = new Properties();
		InputStream is = null;
		
		is = new FileInputStream(configFile);		
		  
		props.load(is);
		
		for(Object ob :  props.keySet()){
			
			String s = (String) ob;
			if(!s.endsWith("logLevel") && !s.endsWith("formator") && !s.endsWith("targetsFactories") && !s.endsWith("params")){
				//okay, we have a class name here.	
//				System.out.println(s);
				//is there any loglevel ?
				if(props.containsKey(s+".logLevel")){
//					System.out.println(ErrorLevel.valueOf(props.getProperty(s+".logLevel")));
					this.setLevel(Class.forName(s), ErrorLevel.valueOf(props.getProperty(s+".logLevel")));
				}
				if (props.containsKey(s+".formator")){
					String formName = props.getProperty(s+".formator");
					Class<?> f = Class.forName(formName);
					Constructor<?> constructor = f.getConstructor(String.class);
					Object instance = constructor.newInstance(s);
					this.setLayout(Class.forName(s), (Formator) instance);
				}
				
				if(props.containsKey(s+".targetsFactories")){
					
					for(String factoryName : props.getProperty(s+".targetsFactories").split(";")) {					
						
						//lets call the Factory
						TargetFactory factory = (TargetFactory) Class.forName(factoryName).newInstance();
						Target t = null;
						
						if(props.containsKey(s+"."+factoryName+".params")){
							//if parameters are defined, lets call with args
							t = factory.getTarget(props.getProperty(s+"."+factoryName+".params"));
						}
						else{//or without args
							t = factory.getTarget();
						}
						this.addTarget(Class.forName(s), t);
					}
				}
			}
		}
		
		try {
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Adds a target to a class
	 * Using it for the first time overwrites the default value
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
	 * Sets the error level for this class.
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
	 * Sets the layout for this class.
	 * <br> If a layout was already specified, it will be overwritten by the new value.
	 * 
	 * @param sClass The specified class.
	 * @param layout The layout that will be applied on all targets.
	 */
	@SuppressWarnings("rawtypes")
	public void setLayout(Class sClass, Formator layout){
		layouts.put(sClass, layout);	
	}
	
	
	
}
