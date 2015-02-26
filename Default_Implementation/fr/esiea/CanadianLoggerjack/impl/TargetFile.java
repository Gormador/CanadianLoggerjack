/**
 * 
 */
package fr.esiea.CanadianLoggerjack.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import fr.esiea.CanadianLoggerjack.Target;

/**
 * Save messages in a file
 *
 */
public class TargetFile implements Target {

	/**
	 * Record the log into a file. 
	 * 
	 * @see Target
	 */
	
	private File file;
	
	/**
	 * Create a file with default name: <code>loggerFile.log</code>
	 * 
	 */
	TargetFile(){
		this.file = new File("loggerFile.log");
	}
	
	/**
	 * Create a file with the specified name.
	 * @param name The file will be <code>name.log</code>
	 */
	TargetFile(String name){
		this.file = new File(name + ".log");
	}
	
	/**
	 * Append the message into the file.
	 * @param message The message to be recorded
	 */
	@Override
	public void record(String message) {
		try {
			FileWriter fileWriter = new FileWriter(this.file, true);
			fileWriter.write(message);
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
