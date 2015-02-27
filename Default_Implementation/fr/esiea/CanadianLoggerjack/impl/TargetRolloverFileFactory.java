package fr.esiea.CanadianLoggerjack.impl;

import fr.esiea.CanadianLoggerjack.InvalidConfigurationException;
import fr.esiea.CanadianLoggerjack.Target;
import fr.esiea.CanadianLoggerjack.TargetFactory;

public class TargetRolloverFileFactory extends TargetFactory {
	
	String[] targetProperties = null;
	String name = null;
	int maxSize = 1024;
	
	public TargetRolloverFileFactory() {
		
	}
	
	/** 
	 * Instantiates a TargetRolloverFile object.
	 * 
	 * @param props Must contain a log file name and / or a max size for the file. 
	 * <br>.properties file structure: TargetRolloverFileFactory.params = "[name]";[size]
	 * <br>The order of the parameters is important. If no name is specified, leave the semicolon (;[size]).
	 * 
	 * @return An instance of a TargetRolloverFile object, constructed with the proper parameter(s).
	 * 
	 * @throws InvalidConfigurationException If the given parameter is empty.
	 */
	@Override
	public Target getTarget(String props) throws InvalidConfigurationException {
		
		this.targetProperties = props.split(";");
		
		if (targetProperties.length == 0) throw (new InvalidConfigurationException());
		
		System.out.println(targetProperties.length);
		System.out.println(targetProperties[0]+";"+targetProperties[1]);
		System.out.println(targetProperties[0].length());
		
		if (targetProperties.length == 1)
		{
			this.name = targetProperties[0];
			
			return (new TargetRolloverFile(name));
		}
		else
		{
			if(!(targetProperties[0].length() == 0) && !(targetProperties[1].length() == 0))
			{
				this.name = targetProperties[0];
				this.maxSize = Integer.parseInt(targetProperties[1]);
				
				return (new TargetRolloverFile(name, maxSize));
			}
			else if ((targetProperties[0].length() == 0) && !(targetProperties[1].length() == 0))
			{
				this.maxSize = Integer.parseInt(targetProperties[1]);
				
				return (new TargetRolloverFile(maxSize));
			}
			
			return (this.getTarget());
		}
//				if(!(targetProperties[0].length() == 0) && !(targetProperties[1].length() == 0))
//				{
//					this.name = targetProperties[0];
//					this.maxSize = Integer.parseInt(targetProperties[1]);
//					
//					return (new TargetRolloverFile(name, maxSize));
//				}
//				else if ((targetProperties[0].length() == 0) && !(targetProperties[1].length() == 0))
//				{
//					this.maxSize = Integer.parseInt(targetProperties[1]);
//					
//					return (new TargetRolloverFile(maxSize));
//				}
//				else if (!(targetProperties[0].length() == 0) && (targetProperties[1].length() == 0))
//				{
//					this.name = targetProperties[0];
//					
//					return (new TargetRolloverFile(name));
//				}

	}

	/**
	 * Instantiates a TargetRolloverFile object.
	 * 
	 * @return An instance of a default TargetRolloverFile object.
	 */
	@Override
	public Target getTarget() throws InvalidConfigurationException {
		return (new TargetRolloverFile());
	}

}
