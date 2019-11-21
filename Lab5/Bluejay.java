/**
 * Bluejay Class for 2D Ecosystem
 * @author Carter Brezinski
 */

public class Bluejay extends Bird {

	/**
	 * Constructor requires definition of an id value for the Bluejay instance.
	 * All bluejays are set as herbivores and also carnivores 
	 * @param idValue an id value for the Bluejay instance
	 */
	public Bluejay(int idValue) {
		super(idValue, 'b', "Bluejay", true, true);
	}

}