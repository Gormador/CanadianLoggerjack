package fr.esiea.CanadianLoggerjack;

import java.util.Properties;

abstract class TargetFactory {
	
	/**
	 * This is the default constructor for the factory.
	 * Each custom target must provide a Factory to be built from a configuratin file.
	 * 
	 */
	public TargetFactory(){
		
	}
	
	/**
	 * This method sets the properties for the target when it is configured from a properties file.
	 * 
	 * @param props A properties objects containing all the properties specified in the config file.
	 * @throws InvalidConfigurationException
	 */
	public abstract Target getTarget(Properties props) throws InvalidConfigurationException;
	
}
