package fr.esiea.CanadianLoggerjack.tester;

import fr.esiea.CanadianLoggerjack.Configuration;
import fr.esiea.CanadianLoggerjack.ErrorLevel;
import fr.esiea.CanadianLoggerjack.Logger;
import fr.esiea.CanadianLoggerjack.LoggerFactory;
import fr.esiea.CanadianLoggerjack.impl.TargetRolloverFile;

public class RolloverFileTester
{

	public RolloverFileTester()
	{
		Configuration conf = new Configuration();
		
		conf.setLevel(this.getClass(), ErrorLevel.DEBUG);
		
		conf.addTarget(this.getClass(), new TargetRolloverFile());
		conf.addTarget(this.getClass(), new TargetRolloverFile("customRollLog"));
		conf.addTarget(this.getClass(), new TargetRolloverFile("customSizeRollLog", 150));
		conf.addTarget(this.getClass(), new TargetRolloverFile(200));
		
		LoggerFactory lf = new LoggerFactory(conf);
		
		Logger l = lf.getLogger(this.getClass());
				
		l.debug("DEBUG message to the console.");
		l.info("INFO message to the console.");
		l.error("ERRO message to the console.");
	}
	
}
