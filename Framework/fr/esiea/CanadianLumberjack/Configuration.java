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
	 * Constructeur avec les valeurs par défaut.
	 * Les paramètres par défaut sont :
	 * Pour toutes les classes, errorlevel <code>ERROR</code>, cible <code>CibleConsole</code>
	 *  
	 */
	public Configuration(){
		
	}
	
	/**
	 * Utilise la configuration contenue dans le fichier properties passé en paramètre
	 * 
	 * DOCUMENTATION DU FICHIER PROPERTIES :
	 * à faire
	 * 
	 * @param configFile
	 */
	public Configuration(File configFile)/* throws FileException, BadConfigException */{
		/* A DEFINIR */
		
		/* le fileexception est à redéfinir (il faut jeter une exception s'il y a un souci avec le fichier)
		 * et le badconfigexceptin est à créer */
		
		 
	}
	
	/**
	 * Ajoute une cible à une classe.
	 * L'utiliser pour la première fois écrase la valeur par défaut.
	 * 
	 * @param classe
	 * @param cible
	 */
	public void ajouterCible(Class classe, Cible cible){
		/* A DEFINIR */
	}
}
