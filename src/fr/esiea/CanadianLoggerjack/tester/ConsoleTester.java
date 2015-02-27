package fr.esiea.CanadianLoggerjack.tester;

import fr.esiea.CanadianLoggerjack.Configuration;
import fr.esiea.CanadianLoggerjack.ErrorLevel;
import fr.esiea.CanadianLoggerjack.Logger;
import fr.esiea.CanadianLoggerjack.LoggerFactory;

public class ConsoleTester
{
	public ConsoleTester()
	{
		Configuration conf = new Configuration();
		
		conf.setLevel(this.getClass(), ErrorLevel.DEBUG);
		
		LoggerFactory lf = new LoggerFactory(conf);
		
		Logger l = lf.getLogger(this.getClass());
		
//		System.out.println(this.getClass().getName());
		
		l.debug("DEBUG message to the console.");
		l.info("INFO message to the console.");
		l.error("ERRO message to the console.");
		
		
	}
}
