/**
 * Tree Class for 2D Ecosystem
 * @author Carter Brezinski
 */
 
public class Tree extends Plant {
	
	/**
	 * Constructor for the Tree class. Tree is a plant, therefore neither a herbivore or a carnivore.
	 * @param idValue an id value for the Tree instance
	 */
	public Tree(int idValue) {
		super(idValue, '#', "Tree");
	}

}