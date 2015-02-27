package fr.esiea.CanadianLoggerjack.impl;

import fr.esiea.CanadianLoggerjack.InvalidConfigurationException;
import fr.esiea.CanadianLoggerjack.Target;
import fr.esiea.CanadianLoggerjack.TargetFactory;



/**
 * Implements TargetFactory for the Console implementation of the Target interface.
 *
 */
public class TargetConsoleFactory extends TargetFactory {

	/**
	 * (non-Javadoc)
	 * @see fr.esiea.CanadianLoggerjack.TargetFactory#getTarget(java.lang.String)
	 * 
	 * @param props Not used for the Console target.
	 * 
	 * @return An instance of TargetConsole.
	 */
	@Override
	public Target getTarget(String props) throws InvalidConfigurationException {
		
		return new TargetConsole();
	}

	@Override
	public Target getTarget() throws InvalidConfigurationException {
		
		return new TargetConsole();
	}
	
	
	
}
