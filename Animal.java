/**
 * Animal Parent Class for 2D Ecosystem
 * @author Carter Brezinski
 */

public class Animal extends Organism {

	/**
	 * Store if an animal is a herbivore
	 */
	boolean isHerbivore;

	/**
	 * Store if an animal is a carnivore
	 */
	boolean isCarnivore;

	/**
	 * Constructor for the animal parent class
	 * @param idValue an id value for the Animal 
	 * @param symbolValue a value for the symbol
	 * @param labelValue a value for the label
	 * @param herbivore true if Animal instance is a herbivore
	 * @param carnivore true if Animal instance is a carnivore
	 */
	public Animal(int idValue, char symbolValue, String labelValue, boolean herbivore, boolean carnivore) {
		super(idValue, symbolValue, labelValue);
		isHerbivore = herbivore;
		isCarnivore = carnivore;
	}
	
	/**
	 * The method is meant to return if the animal is a carnivore
	 * @return boolean value true if the animal is a carnivore
	 */
	boolean checkIfCarnivore()
	{
		return isCarnivore;
	}
	
	/**
	 * The method is meant to return if the animal is a herbivore
	 * @return boolean value true if the animal is a herbivore
	 */
	boolean checkIfHerbivore()
	{
		return isHerbivore;
	}
}
