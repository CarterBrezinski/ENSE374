/**
 * Rabbit Class for 2D Ecosystem
 * @author Carter Brezinski
 */

public class Rabbit extends Mammal {
	/**
	 * Constructor for the Rabbit class, rabbits are all set as herbivores
	 * @param idValue an id value for the Rabbit instance
	 */
	public Rabbit(int idValue) {
		super(idValue, 'r', "Rabbit", true, false);
	}

}