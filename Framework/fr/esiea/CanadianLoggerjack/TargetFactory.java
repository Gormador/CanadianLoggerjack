package fr.esiea.CanadianLoggerjack;

import java.util.Properties;

public abstract class TargetFactory {
	
	/**
	 * This is the default constructor for the factory.
	 * Each custom target must provide a Factory to be built from a configuration file.
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
	public abstract Target getTarget(String props) throws InvalidConfigurationException;
	
	/**
	 * This method sets the properties for the target when it is configured from a properties file.
	 * <br>This method is call when no parameters are set in the config file.
	 * <br>If your class cannot be instantiated without parameter, please always throw an <code>InvalidConfigurationException</code>.
	 * 
	 * @param props A properties objects containing all the properties specified in the config file.
	 * @throws InvalidConfigurationException
	 */
	public abstract Target getTarget() throws InvalidConfigurationException;
	
}
