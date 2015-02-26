/**
 * 
 */
package fr.esiea.CanadianLumberjack;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Affiche les messages en console
 *
 */
public class CibleConsole implements Cible {

	/* (non-Javadoc)
	 * @see fr.esiea.CanadianLumberjack.Cible#record(java.lang.String)
	 */
	
	private File file;
	private String name;
	private int number;
	
	
	CibleConsole(){
		name = "fichierRotatif";
		file = new File(name + ".txt");
		number = 1;
	}
	
	@Override
	public void record(String message) {		
		int tailleFichier = message.getBytes().length + (int)file.length();
				
		try {
			FileWriter fileWriter = new FileWriter(file);
			
			if(tailleFichier < 100){
				fileWriter.write(message);
				fileWriter.close();
			}
			else if (tailleFichier == 100){
				fileWriter.write(message);
				fileWriter.close();
				file = new File("fichierRotatif" + number + ".txt");
				number ++;
			}
			else{
				file = new File("fichierRotatif" + number + ".txt");
				number ++;
				fileWriter.write(message);
				fileWriter.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
