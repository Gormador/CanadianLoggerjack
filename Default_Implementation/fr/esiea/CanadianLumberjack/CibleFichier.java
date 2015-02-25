/**
 * 
 */
package fr.esiea.CanadianLumberjack;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Enregistre les messages dans un fichier
 *
 */
public class CibleFichier implements Cible {

	/* (non-Javadoc)
	 * @see fr.esiea.CanadianLumberjack.Cible#record(java.lang.String)
	 */
	
	private File file;
	
	CibleFichier(){
		this.file = new File("fichier.txt");
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
