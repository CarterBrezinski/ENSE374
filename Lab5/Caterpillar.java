/**
 * Caterpillar Class for 2D Ecosystem
 * @author Carter Brezinski
 */

public class Caterpillar extends Insect {

	/**
	 * Constructor requires definition of an id value for the Grasshopper instance.
	 * All caterpillars are set as herbivores and not carnivores 
	 * @param idValue an id value for the Caterpillar instance
	 */
	public Caterpillar(int idValue) {
		super(idValue, 'c', "Caterpillar", true, false);
	}

}