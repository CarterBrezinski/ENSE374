/**
 * Wolf Class for 2D Ecosystem
 * @author Carter Brezinski
 */
public class Wolf extends Mammal {

	/**
	 * Constructor for Wolf class. Wolves are default carnivores.
	 * @param idValue an id value for the Wolf instance
	 */
	public Wolf(int idValue) {
		super(idValue, 'w', "Wolf", false, true);
	}

}

