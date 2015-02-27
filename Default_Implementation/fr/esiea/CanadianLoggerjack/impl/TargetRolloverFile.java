/**
 * 
 */
package fr.esiea.CanadianLoggerjack.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import fr.esiea.CanadianLoggerjack.Target;

/**
 * Saves messages in a rollover file.
 * <br> When the file reaches a certain size, a new file is created automatically.
 * 
 */
public class TargetRolloverFile implements Target{

	
	private File file;
	private String name;
	private int maxSize;
	
	
	/**
	 * Creates a rollover file with default values:
	 * <br> name: rollover_file.log
	 * <br> max size of the file: 10MB
	 */
	public TargetRolloverFile(){
		this.maxSize = 10 * 1024;
		this.name = "rollover_file";
		file = new File(name + ".log");
	}
	
	/**
	 * Creates a rollover file with a default maxSize and a chosen name
	 * 
	 * @param name The name of the file
	 */
	public TargetRolloverFile(String name){
		this.maxSize = 10 * 1024;
		this.name = name;
		file = new File(name + ".log");
	}
	
	/**
	 * Creates a rollover file with a chosen maxSize and a default name
	 * 
	 * @param maxSize The maximum size of the file in kB.
	 */
	public TargetRolloverFile(int maxSize){
		this.maxSize = maxSize * 1024;
		this.name = "rollover_file";
		file = new File(name + ".log");
	}
	
	/**
	 * Creates a rollover file with a chosen maxSize and a chosen name
	 * 
	 * @param name The name of the file
	 * @param maxSize The maximum size of the file
	 */
	public TargetRolloverFile(String name, int maxSize){
		this.maxSize = maxSize * 1024;
		this.name = name;
		file = new File(name + ".log");
	}
	
	
	/**
	 * Saves a message in a rollover file
	 * 
	 * @param message The message that will be saved in the rollover file
	 */
	@Override
	public void record(String message) {		
		int fileSize = message.getBytes().length + (int)file.length();
		File newName;
		FileWriter fileWriter;		
		
		try {
			if(fileSize < this.maxSize){
				fileWriter = new FileWriter(file, true);
				fileWriter.write(message);
				fileWriter.write("\n");
				fileWriter.close();
			}
			else if (fileSize == this.maxSize){
				fileWriter = new FileWriter(file, true);
				fileWriter.write(message);
				fileWriter.write("\n");
				fileWriter.close();
				newName = new File(new SimpleDateFormat(name + "yyyy/MM/dd_HH-mm-ss").format(new Date()).toString() + ".txt");
				file.renameTo(newName);
			}
			else{
				newName = new File(new SimpleDateFormat(name + "yyyy/MM/dd_HH-mm-ss").format(new Date()).toString() + ".txt");
				file.renameTo(newName);
				fileWriter = new FileWriter(file, true);
				fileWriter.write(message);
				fileWriter.write("\n");
				fileWriter.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
