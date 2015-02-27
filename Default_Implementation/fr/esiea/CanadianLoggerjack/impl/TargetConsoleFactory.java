package fr.esiea.CanadianLoggerjack.impl;

import fr.esiea.CanadianLoggerjack.InvalidConfigurationException;
import fr.esiea.CanadianLoggerjack.Target;
import fr.esiea.CanadianLoggerjack.TargetFactory;



public class TargetConsoleFactory extends TargetFactory {

	@Override
	public Target getTarget(String props) throws InvalidConfigurationException {
		
		return new TargetConsole();
	}

	@Override
	public Target getTarget() throws InvalidConfigurationException {
		
		return new TargetConsole();
	}
	
	
	
}
