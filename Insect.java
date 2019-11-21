/**
 * Insect Parent Class for 2D Ecosystem
 * @author Carter Brezinski
 */

public class Insect extends Animal {

	/**
	 * Constructor for the insect parent class.
	 * @param idValue an id value for the Insects
	 * @param symbolValue a value for the symbol
	 * @param labelValue a value for the label
	 * @param herbivore true if Insect instance is a herbivore
	 * @param carnivore true if Insect instance is a carnivore
	 */
	 
	public Insect(int idValue, char symbolValue, String labelValue, boolean herbivore, boolean carnivore) {
		super(idValue, symbolValue, labelValue, herbivore, carnivore);
	}
}
