/**
 * 
 */
package fr.esiea.CanadianLoggerjack.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import fr.esiea.CanadianLoggerjack.Formator;

/**
 * Displays the date / time, the name of the logger, the message level error and the message.
 *
 */
public class DefaultFormator extends Formator {
	
	private String loggerName;
	
	/**
	 * Creates a formator, with the name of the logger
	 * 
	 * @param loggerName The name of the logger
	 */
	public DefaultFormator(String loggerName){
		super(loggerName); // USELESS
		this.loggerName = loggerName;
//		System.out.println(super.loggerName);
	}
	
	/**
	 * Returns the format for the error level 'ERROR'
	 * 
	 * @param message The message to display
	 */
	@Override
	public String formatError(String message) {
		return formatCommon(message, "ERROR");
	}
	
	/**
	 * Returns the format for the error level 'INFO'
	 * 
	 * @param message The message to display
	 */
	@Override
	public String formatInfo(String message) {
		return formatCommon(message, "INFO");
	}

	/**
	 * Returns the format for the error level 'DEBUG'
	 * 
	 * @param message The message to display
	 */
	@Override
	public String formatDebug(String message) {
		return formatCommon(message, "DEBUG");
	}
	
	/**
	 * Returns the format for the error in parameter
	 * 
	 * @param message The message to display
	 * @param errorLevel The log level of the message
	 */
	private String formatCommon(String message, String errorLevel){
		String date;
		date = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()).toString();
		return(date + "\t" + this.loggerName + "\t" + errorLevel + "\t" + message);
	}

}
