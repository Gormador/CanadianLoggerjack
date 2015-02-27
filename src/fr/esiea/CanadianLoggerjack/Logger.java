/**
 * 
 */
package fr.esiea.CanadianLoggerjack;

import java.util.List;

import static fr.esiea.CanadianLoggerjack.ErrorLevel.*;

/**
 * Logger
 * <br>Only a <code>LoggerFactory</code> can instantiate this object.
 * 
 * @author M. Bougeret &amp; L. Cousi &amp; G. Philippot
 * 
 * LogLevel hierarchy (from less to most verbose): <code>ERROR</code>, <code>DEBUG</code>, <code>INFO</code>. 
 */
public class Logger {
	
	private Formator formator;
	private List<Target> targets;
	private ErrorLevel errLevel;
	
	/**
	 * @param formator The used message formator.
	 * @param targets	The targets.
	 * @param errLevel	The current LogLevel.
	 */
	Logger(Formator formator, List<Target> targets, ErrorLevel errLevel){
		this.formator = formator;
		this.targets = targets;
		this.errLevel = errLevel;
	}
	
	
	/**
	 * Logs an <code>ERROR</code> message
	 * 
	 * @param message The message to be logged
	 */
	public void error(String message){
		if(this.errLevel.compareTo(ERROR)>=0){
			writeMessage(this.formator.formatError(message));
		}
		 
	}
	
	/**
	 * Logs a <code>DEBUG</code> message
	 * 
	 * @param message The message to be logged
	 */
	public void debug(String message){
		if(this.errLevel.compareTo(DEBUG)>=0){
			writeMessage(this.formator.formatDebug(message));
		}
	}
	
	
	/**
	 * Logs an <code>INFO</code> message
	 * 
	 * @param message The message to be logged
	 */
	public void info(String message){
		if(this.errLevel.compareTo(INFO)>=0){
			writeMessage(this.formator.formatInfo(message));
		}
	}
	
	private void writeMessage(String formatedMessage){
		for(Target t : this.targets){
			t.record(formatedMessage);
		}
	}
}
