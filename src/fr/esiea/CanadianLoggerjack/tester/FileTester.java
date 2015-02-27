package fr.esiea.CanadianLoggerjack.tester;

import fr.esiea.CanadianLoggerjack.Configuration;
import fr.esiea.CanadianLoggerjack.ErrorLevel;
import fr.esiea.CanadianLoggerjack.Logger;
import fr.esiea.CanadianLoggerjack.LoggerFactory;
import fr.esiea.CanadianLoggerjack.impl.TargetFile;

/**
 * File logger tester class.
 * 
 * @author M. Bougeret &amp; L. Cousi &amp; G. Philippot
 *
 */
public class FileTester
{

	/**
	 * Default constructor
	 */
	public FileTester()
	{
		Configuration conf = new Configuration();
		
		conf.setLevel(this.getClass(), ErrorLevel.DEBUG);
		conf.addTarget(this.getClass(), new TargetFile());
		conf.addTarget(this.getClass(), new TargetFile("customLog"));
		
		LoggerFactory lf = new LoggerFactory(conf);
		
		Logger l = lf.getLogger(this.getClass());
				
		l.debug("DEBUG message to the console.");
		l.info("INFO message to the console.");
		l.error("ERRO message to the console.");
	}	
}
