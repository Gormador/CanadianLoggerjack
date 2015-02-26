/**
 * 
 */
package fr.esiea.CanadianLumberjack;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Enregistre les messages dans un fichier rotatif.
 * Lorsque le fichier atteint une certaine taille, un nouveau fichier est automatiquement créé.
 *
 */
public class CibleFichierRotatif implements Cible{


	private File file;
	private String name;
	private int number;
	
	
	CibleFichierRotatif(){
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
