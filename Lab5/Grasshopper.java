/**
 * Grasshopper Class for 2D Ecosystem
 * @author Carter Brezinski
 */

public class Grasshopper extends Insect {

	/**
	 * Constructor requires definition of an id value for the Grasshopper instance.
	 * All grasshoppers are set as herbivores and not carnivores 
	 * @param idValue an id value for the Grasshopper instance
	 */
	public Grasshopper(int idValue) {
		super(idValue, 'g', "Grasshopper", true, false);
	}

}