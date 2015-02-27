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
	 * Create a formator, with the name of the logger
	 * @param loggerName The name of the logger
	 */
	public DefaultFormator(String loggerName){
		super(loggerName);
	}
	
	/**
	 * Return the format for the error level 'ERROR'
	 * @param message The message to display
	 */
	@Override
	public String formatError(String message) {
		return formatCommon(message, "ERROR");
	}
	
	/**
	 * Return the format for the error level 'INFO'
	 * @param message The message to display
	 */
	@Override
	public String formatInfo(String message) {
		return formatCommon(message, "INFO");
	}

	/**
	 * Return the format for the error level 'DEBUG'
	 * @param message The message to display
	 */
	@Override
	public String formatDebug(String message) {
		return formatCommon(message, "DEBUG");
	}
	
	/**
	 * Return the format for the error in parameter
	 * @param message The message to display
	 * @param errorLevel The error level of the message
	 */
	private String formatCommon(String message, String errorLevel){
		String date;
		date = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()).toString();
		return(date + "\t" + this.loggerName + "\t" + errorLevel + "\t" + message);
	}

}
