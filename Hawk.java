/**
 * Hawk Class for 2D Ecosystem
 * @author Carter Brezinski
 */

public class Hawk extends Bird {

	/**
	 * Constructor requires definition of an id value for the Hawk instance.
	 * All hawks are set as carnivores and not herbivores 
	 * @param idValue an id value for the Hawk instance
	 */
	public Hawk(int idValue) {
		super(idValue, 'h', "Hawk", false, true);
	}

}