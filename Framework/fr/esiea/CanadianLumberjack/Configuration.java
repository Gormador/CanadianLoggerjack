/**
 * 
 */
package fr.esiea.CanadianLumberjack;

import java.io.File;

/**
 * Classe de configuration
 *
 */
public class Configuration {

	/**
	 * Constructeur avec les valeurs par d�faut.
	 * Les param�tres par d�faut sont :
	 * Pour toutes les classes, errorlevel <code>ERROR</code>, cible <code>CibleConsole</code>
	 *  
	 */
	public Configuration(){
		
	}
	
	/**
	 * Utilise la configuration contenue dans le fichier properties pass� en param�tre
	 * 
	 * DOCUMENTATION DU FICHIER PROPERTIES :
	 * � faire
	 * 
	 * @param configFile
	 */
	public Configuration(File configFile)/* throws FileException, BadConfigException */{
		/* A DEFINIR */
		
		/* le fileexception est � red�finir (il faut jeter une exception s'il y a un souci avec le fichier)
		 * et le badconfigexceptin est � cr�er */
		
		 
	}
	
	/**
	 * Ajoute une cible � une classe.
	 * L'utiliser pour la premi�re fois �crase la valeur par d�faut.
	 * 
	 * @param classe
	 * @param cible
	 */
	public void ajouterCible(Class classe, Cible cible){
		/* A DEFINIR */
	}
}
