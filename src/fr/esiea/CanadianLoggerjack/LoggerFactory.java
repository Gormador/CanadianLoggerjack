/**
 * 
 */
package fr.esiea.CanadianLoggerjack;

import java.util.HashMap;
import java.util.LinkedList;

import fr.esiea.CanadianLoggerjack.impl.DefaultFormator;
import fr.esiea.CanadianLoggerjack.impl.TargetConsole;


/**
 * The LoggerFactory. Used to build the logger.
 * 
 * @author M. Bougeret &amp; L. Cousi &amp; G. Philippot
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
	 * Instantiates a <code>LoggerFactory</code> with the parameters specified in the properties file.
	 * 
	 * @param config The configuration for the LoggerFactory
	 * @see Configuration
	 */
	@SuppressWarnings("rawtypes")
	public LoggerFactory(Configuration config) {		
		this.targets = (config.targets == null) ?  new HashMap<Class, LinkedList<Target>>() : new HashMap<Class, LinkedList<Target>>(config.targets);
		this.errLevels = (config.errLevels == null) ? new HashMap<Class, ErrorLevel>() : new HashMap<Class, ErrorLevel>(config.errLevels);
		this.layouts = (config.layouts == null) ? new HashMap<Class, Formator>() : new HashMap<Class, Formator>(config.layouts);
	}
	
	/**
	 * Instantiates a <code>Logger</code>, configured for the specified class according <code>Configuration</code> settings.
	 * 
	 * 
	 * @param sClass The specified class
	 * @return A logger instantiated for the specified class
	 */
	@SuppressWarnings("rawtypes")
	public Logger getLogger(Class sClass){
		
		LinkedList<Target> t;
		ErrorLevel errLv;
		Formator f;
		
		if(this.targets.containsKey(sClass)){
			t =  this.targets.get(sClass);
		}
		else{
			t= new LinkedList<Target>();
			t.add(new TargetConsole());
		}
		
		errLv = this.errLevels.containsKey(sClass) ? this.errLevels.get(sClass) : ErrorLevel.ERROR;
		
		f = this.layouts.containsKey(sClass) ? this.layouts.get(sClass) : new DefaultFormator(sClass.getName());
			
		
		return (new Logger(f, t, errLv));
	}
	
}
