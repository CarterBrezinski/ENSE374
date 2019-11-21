/**
 * Bird Parent Class for 2D Ecosystem
 * @author Carter Brezinski
 */

public class Bird extends Animal {

	/**
	 * Constructor for the bird parent class
	 * is a herbivore and/or a carnivore
	 * @param idValue an id value for the Bird 
	 * @param symbolValue a value for the symbol
	 * @param labelValue a value for the label
	 * @param herbivore true if Bird instance is a herbivore
	 * @param carnivore true if Bird instance is a carnivore
	 */
	 
	public Bird(int idValue, char symbolValue, String labelValue, boolean herbivore, boolean carnivore) {
		super(idValue, symbolValue, labelValue, herbivore, carnivore);
	}


}
