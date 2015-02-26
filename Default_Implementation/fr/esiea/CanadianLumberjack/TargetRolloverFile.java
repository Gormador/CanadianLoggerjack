/**
 * 
 */
package fr.esiea.CanadianLumberjack;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Save messages in a rollover file
 * When the file reaches a certain size, a new file is created automatically.
 * 
 */
public class TargetRolloverFile implements Cible{


	private File file;
	private String name;
	private int maxSize;
	
	
	TargetRolloverFile(){
		this.maxSize = 10 * 1024;
		this.name = "rollover_file";
		file = new File(name + ".txt");
	}
	
	TargetRolloverFile(String name){
		this.maxSize = 10 * 1024;
		this.name = name;
		file = new File(name + ".txt");
	}
	
	TargetRolloverFile(int maxSize){
		this.maxSize = maxSize * 1024;
		this.name = "rollover_file";
		file = new File(name + ".txt");
	}
	
	TargetRolloverFile(String name, int maxSize){
		this.maxSize = maxSize * 1024;
		this.name = name;
		file = new File(name + ".txt");
	}
	
	@Override
	public void record(String message) {		
		int fileSize = message.getBytes().length + (int)file.length();
		File newName;
		FileWriter fileWriter;		
		
		try {
			if(fileSize < this.maxSize){
				fileWriter = new FileWriter(file, true);
				fileWriter.write(message);
				fileWriter.close();
			}
			else if (fileSize == this.maxSize){
				fileWriter = new FileWriter(file, true);
				fileWriter.write(message);
				fileWriter.close();
				newName = new File(new SimpleDateFormat("yyyy/MM/dd_HH-mm-ss").format(new Date()).toString() + ".txt");
				file.renameTo(newName);
			}
			else{
				newName = new File(new SimpleDateFormat("yyyy/MM/dd_HH-mm-ss").format(new Date()).toString() + ".txt");
				file.renameTo(newName);
				fileWriter = new FileWriter(file, true);
				fileWriter.write(message);
				fileWriter.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
