/**
 * Mouse Class for 2D Ecosystem
 * @author Carter Brezinski
 */

public class Mouse extends Mammal {

	/**
	 * Constructor for the mouse class, mice are set as herbivores
	 * @param idValue an id value for the Mouse instance
	 */
	public Mouse(int idValue) {
		super(idValue, 'm', "Mouse", true, false);
	}

}