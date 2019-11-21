/**
 * Mammal Parent Class for 2D Ecosystem
 * @author Carter Brezinski
 */

public class Mammal extends Animal {
	/**
	 * Constructor for the Mammal parent class
	 * @param idValue an id value for the Mammal
	 * @param symbolValue a value for the symbol
	 * @param labelValue a value for the label
	 * @param herbivore true if Mammal instance is a herbivore
	 * @param carnivore true if Mammal instance is a carnivore
	 */
	 
	public Mammal(int idValue, char symbolValue, String labelValue, boolean herbivore, boolean carnivore) {
		super(idValue, symbolValue, labelValue, herbivore, carnivore);
	}
}
