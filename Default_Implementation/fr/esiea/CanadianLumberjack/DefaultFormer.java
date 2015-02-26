/**
 * 
 */
package fr.esiea.CanadianLumberjack;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Displays the date / time, the name of the logger, the message level error and the message.
 *
 */
public class DefaultFormer implements Formator {

	/* (non-Javadoc)
	 * @see fr.esiea.CanadianLumberjack.Formateur#formatError(java.lang.String)
	 */
	
	private String loggerName;
	
	DefaultFormer(String loggerName){
		this.loggerName = loggerName;
	}
	@Override
	public String formatError(String message) {
		return formatCommon(message, "ERROR");
	}

	/* (non-Javadoc)
	 * @see fr.esiea.CanadianLumberjack.Formateur#formatInfo(java.lang.String)
	 */
	@Override
	public String formatInfo(String message) {
		return formatCommon(message, "INFO");
	}

	/* (non-Javadoc)
	 * @see fr.esiea.CanadianLumberjack.Formateur#formatDebug(java.lang.String)
	 */
	@Override
	public String formatDebug(String message) {
		return formatCommon(message, "DEBUG");
	}
	
	private String formatCommon(String message, String errorLevel){
		String date;
		date = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()).toString();
		return(date + "\t" + this.loggerName + "\t" + errorLevel + "\t" + message);
	}

}
