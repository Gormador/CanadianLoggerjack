/**
 * 
 */
package fr.esiea.CanadianLumberjack;

/**
 * Interface Cible
 *
 * Toute cible doit respecter cette interface.
 */
public interface Target {

	
	/**
	 * Cette méthode doit enregistrer le message selon le moyen implémenté par la classe.
	 * @param message
	 */
	public abstract void record(String message);
	
}
