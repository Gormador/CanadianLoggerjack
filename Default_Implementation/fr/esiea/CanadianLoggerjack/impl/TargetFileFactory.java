package fr.esiea.CanadianLoggerjack.impl;

import fr.esiea.CanadianLoggerjack.InvalidConfigurationException;
import fr.esiea.CanadianLoggerjack.Target;
import fr.esiea.CanadianLoggerjack.TargetFactory;

public class TargetFileFactory extends TargetFactory {

	public TargetFileFactory() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Create a TargetFile object.
	 * 
	 * @param props must be the filename
	 * @see TargetFile
	 */
	@Override
	public Target getTarget(String props) throws InvalidConfigurationException {
		return(new TargetFile(props));
		
	}
	
	/**
	 * Create a TargetFile object with the default name
	 * 
	 * @see TargetFile
	 */
	@Override
	public Target getTarget() throws InvalidConfigurationException {
		return(new TargetFile());
	}

}
