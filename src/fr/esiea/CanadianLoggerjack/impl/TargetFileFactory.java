package fr.esiea.CanadianLoggerjack.impl;

import fr.esiea.CanadianLoggerjack.InvalidConfigurationException;
import fr.esiea.CanadianLoggerjack.Target;
import fr.esiea.CanadianLoggerjack.TargetFactory;

/**
 * A factory used to build a TargetFile.
 * 
 * @author M. Bougeret &amp; L. Cousi &amp; G. Philippot
 */
public class TargetFileFactory extends TargetFactory {

	/**
	 * The given parameters for the target in the .properties file.
	 */
	private String[] params = null;
	
	/**
	 * The file name.
	 */
	private String name = null;
	
	/**
	 *  Default constructor. Dummy.
	 */
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
