package fr.esiea.CanadianLoggerjack;


/**
 * TargetFactory. Used to build a target.
 * Extend this class if you're building your own Factory.
 * 
 * @author M. Bougeret &amp; L. Cousi &amp; G. Philippot
 *
 */
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
	 * @throws InvalidConfigurationException Exception thrown when the given configuration is invalid.
	 * 
	 * @return A instance of the Target.
	 */
	public abstract Target getTarget(String props) throws InvalidConfigurationException;
	
	/**
	 * This method sets the properties for the target when it is configured from a properties file.
	 * <br>This method is call when no parameters are set in the config file.
	 * <br>If your class cannot be instantiated without parameter, please always throw an <code>InvalidConfigurationException</code>.
	 * 
	 * @throws InvalidConfigurationException Exception thrown when the given configuration is invalid.
	 * 
	 * @return A instance of the Target.
	 */
	public abstract Target getTarget() throws InvalidConfigurationException;
	
}
