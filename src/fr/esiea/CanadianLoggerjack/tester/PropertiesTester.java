package fr.esiea.CanadianLoggerjack.tester;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import fr.esiea.CanadianLoggerjack.Configuration;
import fr.esiea.CanadianLoggerjack.InvalidConfigurationException;
import fr.esiea.CanadianLoggerjack.Logger;
import fr.esiea.CanadianLoggerjack.LoggerFactory;

public class PropertiesTester
{
	public PropertiesTester()
	{
		File f = new File("src/resources/loggerConfig.properties");
		
		Configuration conf = null;
		try
		{
			conf = new Configuration(f);
		}
		catch (ClassNotFoundException | NoSuchMethodException
				| SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException
				| InvocationTargetException | InvalidConfigurationException
				| IOException e)
		{
			e.printStackTrace();
			
			System.exit(0);
		}
		
		LoggerFactory lf = new LoggerFactory(conf);
		Logger l = lf.getLogger(this.getClass());
		
		l.debug("DEBUG message to the console.");
		l.info("INFO message to the console.");
		l.error("ERROR message to the console.");
	}	
	
}
