package fr.esiea.CanadianLoggerjack.impl;

import fr.esiea.CanadianLoggerjack.InvalidConfigurationException;
import fr.esiea.CanadianLoggerjack.Target;
import fr.esiea.CanadianLoggerjack.TargetFactory;

public class TargetFileFactory extends TargetFactory {

	String[] params = null;
	String name = null;
	
	public TargetFileFactory() {

	}
	
	/**
	 * (non-Javadoc)
	 * @see fr.esiea.CanadianLoggerjack.TargetFactory#getTarget(java.lang.String)
	 * 
	 * @param props Specifies the log filename.
	 * @throws InvalidConfigurationException If the string is empty.
	 * 
	 * @return An instance of TargetFile constructed with the proper parameter.
	 */
	@Override
	public Target getTarget(String props) throws InvalidConfigurationException {
		
		this.params = props.split(";");
		
		if (props.length() == 0 || params.length > 1) throw (new InvalidConfigurationException());
		
		this.name = params[0];
		
		return(new TargetFile(name));	
	}
	
	
	/* (non-Javadoc)
	 * @see fr.esiea.CanadianLoggerjack.TargetFactory#getTarget()
	 */
	@Override
	public Target getTarget() throws InvalidConfigurationException {
		return(new TargetFile());
	}

}
