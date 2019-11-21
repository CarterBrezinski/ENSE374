/**
 * Deer Class for 2D Ecosystem
 * @author Carter Brezinski
 */

public class Deer extends Mammal {
	
	/**
	 * Constructor requires definition of an id value for the Deer instance.
	 * All deer are set as herbivores and not carnivores 
	 * @param idValue an id value for the Deer instance
	 */
	public Deer(int idValue) {
		super(idValue,'d',"Deer", true, false);
	}

}