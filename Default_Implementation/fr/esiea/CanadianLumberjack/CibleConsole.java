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
	
	@Override
	public void record(String message) {		
		System.out.println(message);
	}
}
