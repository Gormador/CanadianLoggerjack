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
	
	TargetFile(){
		this.file = new File("loggerFile.txt");
	}
	
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
