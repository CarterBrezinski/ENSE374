/**
 * Fox Class for 2D Ecosystem
 * @author Carter Brezinski
 */

public class Fox extends Mammal {

	/**
	 * Constructor requires definition of an id value for the Fox instance.
	 * All foxes are set as carnivores and not herbivores 
	 * @param idValue an id value for the Fox instance
	 */
	public Fox(int idValue) {
		super(idValue, 'f', "Fox", false, true);
	}

}