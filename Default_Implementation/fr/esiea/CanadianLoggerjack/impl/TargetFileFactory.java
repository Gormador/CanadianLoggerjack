package fr.esiea.CanadianLoggerjack.impl;

import fr.esiea.CanadianLoggerjack.InvalidConfigurationException;
import fr.esiea.CanadianLoggerjack.Target;
import fr.esiea.CanadianLoggerjack.TargetFactory;

public class TargetFileFactory extends TargetFactory {

	public TargetFileFactory() {

	}

	
	/* (non-Javadoc)
	 * @see fr.esiea.CanadianLoggerjack.TargetFactory#getTarget(java.lang.String)
	 */
	@Override
	public Target getTarget(String props) throws InvalidConfigurationException {
		
		if (props.length() == 0) throw (new InvalidConfigurationException());
		
		return(new TargetFile(props));
		
	}
	
	
	/* (non-Javadoc)
	 * @see fr.esiea.CanadianLoggerjack.TargetFactory#getTarget()
	 */
	@Override
	public Target getTarget() throws InvalidConfigurationException {
		return(new TargetFile());
	}

}
