/**
 * Organism Parent Class for 2D Ecosystem
 * @author Carter Brezinski
 */

public class Organism {
	/**
	 * Field to store a symbol to display for organism. In subclasses,
	 * the chosen char is either the organism's first initial or a character
	 * that I felt looks like the organism being represented
	 */
	char symbol = 'O';

	String label;
	
	/**
	 * Identify an instance of an Organism
	 */
	int id;

	/**
	 * Store an organism's x position
	 */
	int xPos;

	/**
	 * Field to store an organism's y position
	 */
	int yPos;

	/**
	 * Constructor for a new Organism
	 * @param idValue a value for the ID
	 * @param symbolValue a value for the symbol
	 * @param labelValue a value for the label
	 */
	public Organism(int idValue, char symbolValue, String labelValue)
	{
		id = idValue;
		label = labelValue;
		symbol = symbolValue;
	}

	/**
	 * This method is meant to retrieve the id of an Organism
	 * @return the id of the organism.
	 */
	int getID()
	{
		return id;
	}

	/**
	 * This method is meant to retrieve the symbol of an Organism
	 * @return the symbol of the organism
	 */
	char getSymbol()
	{
		return symbol;
	}

	/**
	 * This method is to retrieve the label of an Organism
	 * @return the label of the organism
	 */
	String getLabel()
	{
		return label;
	}

	/**
	 * Method to update position values of an organism
	 * @param x value of x position
	 * @param y value of y position
	 */
	void updatePos(int x, int y)
	{
		xPos = x;
		yPos = y;
	}

	/**
	 * This method is meant to retrieve the y position of an Organism
	 * @return the y position of the Organism
	 */
	int getVertPos()
	{
		return yPos;
	}

	/**
	 * This method is meant to retrieve the x position of an Organism
	 * @return the x position of the organism
	 */
	int getHorzPos()
	{
		return xPos;
	}
}
