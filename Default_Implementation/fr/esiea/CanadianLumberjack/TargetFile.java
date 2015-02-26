/**
 * 
 */
package fr.esiea.CanadianLumberjack;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Save messages in a file
 *
 */
public class TargetFile implements Target {

	/* (non-Javadoc)
	 * @see fr.esiea.CanadianLumberjack.Cible#record(java.lang.String)
	 */
	
	private File file;
	
	/**
	 * Create a file with default name 'loggerFile.txt'
	 * 
	 */
	TargetFile(){
		this.file = new File("loggerFile.txt");
	}
	
	/**
	 * Create a file with a chosen name
	 * @param name Name of the file
	 */
	TargetFile(String name){
		this.file = new File(name + ".txt");
	}
	
	/**
	 * Save a message in a file
	 * @param message The message that will be saved in the file
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
