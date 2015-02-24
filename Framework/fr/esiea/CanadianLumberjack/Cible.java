/**
 * 
 */
package fr.esiea.CanadianLumberjack;

/**
 * Interface Cible
 *
 * Toute cible doit respecter cette interface.
 */
public interface Cible {

	
	/**
	 * Cette m�thode doit enregistrer le message selon le moyen impl�ment� par la classe.
	 * @param message
	 */
	public abstract void record(String message);
	
}