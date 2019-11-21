/**
 * Shrub Class for 2D Ecosystem
 * @author Carter Brezinski
 */
 
 public class Shrub extends Plant {

	/**
	 * Constructor for the dice class, dice are plants and thus not a herbivore or a carnivore
	 * @param idValue an id value for the Shrub instance
	 */
	public Shrub(int idValue) {
		super(idValue, '%', "Shrub");
	}

}